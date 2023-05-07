package com.fbiopereira.domain.model;

import com.fbiopereira.domain.enums.CompanyBranchType;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyBranch {

    //<editor-fold desc="PROPERTIES">
    private UUID branchId;
    private String name;
    private int taxIdentificationNumber;

    private CompanyBranchType companyBranchType;
    private String zipCode;

    private String address;

    private String addressComplement;
    private String city;

    private String state;

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

    public void setName(String name) {
        this.name = name;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
