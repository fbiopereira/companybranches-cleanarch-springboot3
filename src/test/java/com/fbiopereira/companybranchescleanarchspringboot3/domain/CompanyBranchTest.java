package com.fbiopereira.companybranchescleanarchspringboot3.domain;

import com.fbiopereira.companybranchescleanarchspringboot3.domain.model.CompanyBranch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyBranchTest {

    @Test
    @DisplayName("Testing if CompanyBranch is created correctly")
    void CompanyBranchCreation(){

        CompanyBranch companyBranch = new CompanyBranch();
        assertNull(companyBranch.getBranchId());
        assertNull(companyBranch.getName());
        assertNull(companyBranch.getCompanyBranchType());
        assertEquals(0, companyBranch.getTaxIdentificationNumber());
        assertTrue(companyBranch.isOperative());
        assertNotNull(companyBranch.getRegisterDate());
        assertNull(companyBranch.getLastUpdated());

    }
}
