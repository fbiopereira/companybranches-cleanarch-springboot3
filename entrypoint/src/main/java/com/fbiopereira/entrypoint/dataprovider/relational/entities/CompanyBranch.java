package com.fbiopereira.entrypoint.dataprovider.relational.entities;

import com.fbiopereira.domain.enums.CompanyBranchType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CompanyBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int branchId;
    @Column(nullable = false, unique = false, length = 200)
    private String name;
    @Column(nullable = false, unique = false)
    private int taxIdentificationNumber;

    private String city;

    private String state;

    private CompanyBranchType companyBranchType;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean operative;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDateTime registerDate;

    private LocalDateTime lastUpdated;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
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
}
