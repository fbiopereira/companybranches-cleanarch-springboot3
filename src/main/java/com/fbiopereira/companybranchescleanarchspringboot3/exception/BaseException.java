package com.fbiopereira.companybranchescleanarchspringboot3.exception;

public abstract class BaseException extends RuntimeException {

    public abstract String getName();
    public abstract String getFriendlyMessage();
    public abstract String getErrorCode();
    public abstract int getHttpStatusCode();

    public BaseException(String message) {
        super(message);
    }
}
