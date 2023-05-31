package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception;

import com.fbiopereira.companybranchescleanarchspringboot3.exception.BaseException;

public class EnderecoApiClientException extends BaseException {


    private final String  errorCode = "ERDATA-001";
    private final String friendlyMessage = "An error occurred in EnderecoApi when consulting ZipCode";
    private final String name = "EnderecoApiClientException";

    public EnderecoApiClientException(String message, int httpStatusCode) {
        super(message, httpStatusCode);
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
