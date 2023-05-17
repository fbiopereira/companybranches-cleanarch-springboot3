package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.customerrordecoder;

import feign.Response;
import feign.codec.ErrorDecoder;

public class EnderecoApiErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()){
            case 400:
                return new Exception();
            case 404:
                return new Exception("ZipCode not found");
            case 503:
                return new Exception("EnderecoAPI is unavailable");
            default:
                return new Exception("Exception while getting Address by ZipCode");
        }
    }
}
