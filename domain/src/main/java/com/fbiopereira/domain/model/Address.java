package com.fbiopereira.domain.model;

public class Address {

    //<editor-fold desc="PROPERTIES">
    private String zipCode;
    private String street;
    private String addressComplement;
    private String city;
    private String state;
    //</editor-fold>

    //<editor-fold desc="GETTERS AND SETTERS">

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    //</editor-fold>
}
