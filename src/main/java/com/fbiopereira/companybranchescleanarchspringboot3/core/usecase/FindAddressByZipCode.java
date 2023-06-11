package com.fbiopereira.companybranchescleanarchspringboot3.core.usecase;


import com.fbiopereira.companybranchescleanarchspringboot3.core.model.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
