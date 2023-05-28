package com.fbiopereira.companybranchescleanarchspringboot3.unit.domain.model;

import com.fbiopereira.companybranchescleanarchspringboot3.exception.InvalidCompanyBranchNameException;
import com.fbiopereira.companybranchescleanarchspringboot3.model.CompanyBranch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyBranchUnitTest {

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

    @Test
    @DisplayName("Testing if CompanyBranch Name has at least 3 characters")
    void CompanyBranchNameMinimumSizeValidation(){

        CompanyBranch companyBranch = new CompanyBranch();
        assertThrows(InvalidCompanyBranchNameException.class, () -> companyBranch.setName("1"));
        assertThrows(InvalidCompanyBranchNameException.class, () -> companyBranch.setName("12"));
        assertThrows(InvalidCompanyBranchNameException.class, () -> companyBranch.setName("   "));
        assertThrows(InvalidCompanyBranchNameException.class, () -> companyBranch.setName("..."));

        try {
            companyBranch.setName("123");
        } catch (InvalidCompanyBranchNameException e) {
            throw new RuntimeException(e);
        }

        String companyBranchName = "";

        for (int i = 0; i < 200; i++) {

            companyBranchName =  companyBranchName.concat("a");
        }

        try {
            companyBranch.setName(companyBranchName);
        } catch (InvalidCompanyBranchNameException e) {
            throw new RuntimeException(e);
        }

        assertEquals(companyBranchName, companyBranch.getName());



    }

    @Test
    @DisplayName("Testing if CompanyBranch Name has at maximum 200 characters")
    void CompanyBranchNameMaximumSizeValidation(){

        CompanyBranch companyBranch = new CompanyBranch();

        String companyBranchName = "";

        for (int i = 0; i < 200; i++) {

            companyBranchName =  companyBranchName.concat("a");
        }

        try {
            companyBranch.setName(companyBranchName);
        } catch (InvalidCompanyBranchNameException e) {
            throw new RuntimeException(e);
        }

        assertEquals(companyBranchName, companyBranch.getName());

        companyBranchName =  companyBranchName.concat("a");

        String finalCompanyBranchName = companyBranchName;
        assertThrows(InvalidCompanyBranchNameException.class, () -> companyBranch.setName(finalCompanyBranchName));



    }
}
