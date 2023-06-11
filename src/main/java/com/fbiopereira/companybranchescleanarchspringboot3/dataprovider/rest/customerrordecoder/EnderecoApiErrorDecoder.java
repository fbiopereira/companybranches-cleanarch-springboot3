package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.customerrordecoder;


import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception.EnderecoApiClientException;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception.EnderecoApiClientZipCodeNotFoundException;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.InputStream;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class EnderecoApiErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {



        switch (response.status()){
            case 400:
                return new EnderecoApiClientException("Bad Request", 400);
            case 404:
                return new EnderecoApiClientZipCodeNotFoundException(extractEnderecoApiResponseFromFeignResponse(response).toString());
            case 503:
                return new EnderecoApiClientException("EnderecoAPI is unavailable", 503);
            default:
                return new EnderecoApiClientException("Exception while getting Address by ZipCode", 500);
        }
    }

    private EnderecoApiResponse extractEnderecoApiResponseFromFeignResponse(Response response){

        EnderecoApiResponse message;
        try (InputStream bodyIs = response.body()
                .asInputStream()) {
            ObjectMapper mapper = new ObjectMapper();
            message = mapper.readValue(bodyIs, EnderecoApiResponse.class);
            return message;
        } catch (IOException e) {
            return new EnderecoApiResponse();
        }

    }
}
