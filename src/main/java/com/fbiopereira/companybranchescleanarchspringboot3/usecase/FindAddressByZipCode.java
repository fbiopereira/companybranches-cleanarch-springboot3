package com.fbiopereira.companybranchescleanarchspringboot3.usecase;


import com.fbiopereira.companybranchescleanarchspringboot3.model.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
