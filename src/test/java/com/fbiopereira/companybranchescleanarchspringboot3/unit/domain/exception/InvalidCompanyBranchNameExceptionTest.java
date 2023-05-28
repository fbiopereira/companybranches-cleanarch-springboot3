package com.fbiopereira.companybranchescleanarchspringboot3.unit.domain.exception;

import com.fbiopereira.companybranchescleanarchspringboot3.exception.InvalidCompanyBranchNameException;
import com.fbiopereira.companybranchescleanarchspringboot3.model.CompanyBranch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvalidCompanyBranchNameExceptionTest {

    @Test
    @DisplayName("Testing if InvalidCompanyBranchNameException has the right message")
    void InvalidCompanyBranchNameExceptionMessageTest(){

        InvalidCompanyBranchNameException invalidCompanyBranchNameException = new InvalidCompanyBranchNameException("none");
        assertEquals("Invalid company branch name. It must have from 3 to 200 characters.", invalidCompanyBranchNameException.getFriendlyMessage());
        assertEquals("none", invalidCompanyBranchNameException.getMessage());

    }

    @Test
    @DisplayName("Testing if InvalidCompanyBranchNameException has the right Error Code")
    void InvalidCompanyBranchExceptionErrorCodeTest(){

        InvalidCompanyBranchNameException invalidCompanyBranchNameException = new InvalidCompanyBranchNameException("none");
        assertEquals("ERD-001", invalidCompanyBranchNameException.getErrorCode());
    }

    @Test
    @DisplayName("Testing if InvalidCompanyBranchNameException has the right Http Status Code")
    void InvalidCompanyBranchExceptionHttpStatusCodeTest(){

        InvalidCompanyBranchNameException invalidCompanyBranchNameException = new InvalidCompanyBranchNameException("none");
        assertEquals(400, invalidCompanyBranchNameException.getHttpStatusCode());
    }
}
