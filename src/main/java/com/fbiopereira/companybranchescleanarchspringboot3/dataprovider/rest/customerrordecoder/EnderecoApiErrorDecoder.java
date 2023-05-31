package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.customerrordecoder;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception.EnderecoApiClientException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class EnderecoApiErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()){
            case 400:
                return new EnderecoApiClientException("Bad Request", 400);
            case 404:
                return new EnderecoApiClientException("ZipCode not found", 404);
            case 503:
                return new EnderecoApiClientException("EnderecoAPI is unavailable", 503);
            default:
                return new EnderecoApiClientException("Exception while getting Address by ZipCode", 500);
        }
    }
}
