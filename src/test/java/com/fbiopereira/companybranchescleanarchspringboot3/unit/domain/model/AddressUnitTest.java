package com.fbiopereira.companybranchescleanarchspringboot3.unit.domain.model;


import com.fbiopereira.companybranchescleanarchspringboot3.model.Address;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AddressUnitTest {

    @Test
    @DisplayName("Testing if Address is created with all values nullable")
    void AddressCreation(){

        Address address = new Address();
        assertNull(address.getZipCode());
        assertNull(address.getStreet());
        assertNull(address.getAddressComplement());
        assertNull(address.getCity());
        assertNull(address.getState());
    }

}
