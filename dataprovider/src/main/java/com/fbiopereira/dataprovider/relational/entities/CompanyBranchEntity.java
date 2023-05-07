/**
package com.fbiopereira.dataprovider.relational.entities;

import com.fbiopereira.domain.enums.CompanyBranchType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class CompanyBranchEntity {

    @Id
    @Column(nullable = false, unique = true)
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID branchId;
    @Column(nullable = false, length = 200)
    private String name;
    @Column(nullable = false, unique = true)
    private int taxIdentificationNumber;

    @Column(nullable = false)
    private CompanyBranchType companyBranchType;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String addressComplement;
    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private boolean operative;

    @Column(nullable = false)
    private LocalDateTime registerDate;

    private LocalDateTime lastUpdated;


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
**/