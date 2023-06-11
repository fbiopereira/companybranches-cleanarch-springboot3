package com.fbiopereira.companybranchescleanarchspringboot3.core.model;



import com.fbiopereira.companybranchescleanarchspringboot3.enumerator.CompanyBranchType;
import com.fbiopereira.companybranchescleanarchspringboot3.exception.InvalidCompanyBranchNameException;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyBranch {

    //<editor-fold desc="PROPERTIES">
    private UUID branchId;
    private String name;
    private int taxIdentificationNumber;
    private CompanyBranchType companyBranchType;
    private boolean operative;
    private LocalDateTime registerDate;
    private LocalDateTime lastUpdated;

    //</editor-fold>

    //<editor-fold desc="CONSTRUCTORS">

    public CompanyBranch() {
        this.operative = true;
        this.registerDate = LocalDateTime.now();
    }


    //</editor-fold>

    //<editor-fold desc="GETTERS AND SETTERS">
    public UUID getBranchId() {
        return branchId;
    }

    public void setBranchId(UUID branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidCompanyBranchNameException {

        if (name.matches("^\\w{3,200}")) {
            this.name = name;
        } else throw new InvalidCompanyBranchNameException("Invalid company branch name. It must have from 3 to 200 characters.");

    }

    public int getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(int taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public CompanyBranchType getCompanyBranchType() {
        return companyBranchType;
    }

    public void setCompanyBranchType(CompanyBranchType companyBranchType) {
        this.companyBranchType = companyBranchType;
    }

    public boolean isOperative() {
        return operative;
    }

    public void setOperative(boolean operative) {
        this.operative = operative;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    //</editor-fold>

}
