package com.fbiopereira.companybranchescleanarchspringboot3.exception;

public abstract class BaseException extends RuntimeException {

    protected int httpStatusCode;

    public abstract String getName();
    public abstract String getFriendlyMessage();
    public abstract String getErrorCode();
    public abstract int getHttpStatusCode();



    protected BaseException(String message) {
        super(message);
    }

    protected BaseException(String message, int httpStatusCode) {

        super(message);
        this.httpStatusCode = httpStatusCode;
    }
}
