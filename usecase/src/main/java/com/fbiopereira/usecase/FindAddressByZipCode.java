package com.fbiopereira.usecase;

import com.fbiopereira.domain.model.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
