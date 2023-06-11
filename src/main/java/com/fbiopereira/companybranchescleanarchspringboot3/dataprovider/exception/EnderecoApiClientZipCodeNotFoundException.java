package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception;

import com.fbiopereira.companybranchescleanarchspringboot3.exception.BaseException;

public class EnderecoApiClientZipCodeNotFoundException extends BaseException {

    private final String  errorCode = "ERDATA-002";
    private final String friendlyMessage = "ZipCode not found in EnderecoApi";
    private final String name = "EnderecoApiClientException";

    public EnderecoApiClientZipCodeNotFoundException(String message) {
        super(message);
        this.httpStatusCode = 404;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFriendlyMessage() {
        return friendlyMessage;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

}
