package com.fbiopereira.companybranchescleanarchspringboot3.domain;


import com.fbiopereira.companybranchescleanarchspringboot3.domain.model.Address;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AddressTest {

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
