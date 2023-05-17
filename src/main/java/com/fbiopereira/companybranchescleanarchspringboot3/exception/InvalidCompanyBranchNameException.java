package com.fbiopereira.companybranchescleanarchspringboot3.exception;

public class InvalidCompanyBranchNameException extends BaseException {

    public InvalidCompanyBranchNameException(String message) {
        super(message);
    }

    @Override
    public String getName() {
        return "InvalidCompanyBranchNameException";
    }

    @Override
    public String getFriendlyMessage() {
        return "Invalid company branch name. It must have from 3 to 200 characters.";
    }

    @Override
    public String getErrorCode() {
        return "ERD-001";
    }

    @Override
    public int getHttpStatusCode() {
        return 400;
    }
}
