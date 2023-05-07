package com.fbiopereira.dataprovider.usecaseimpl;

import com.fbiopereira.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.dataprovider.rest.mapper.EnderecoApiResponseMapper;
import com.fbiopereira.domain.model.Address;
import com.fbiopereira.usecase.FindAddressByZipCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private EnderecoApiClient enderecoApiClient;

    @Autowired
    private EnderecoApiResponseMapper enderecoApiResponseMapper;

    @Override
    public Address find(String zipCode) {

        var addressResponse = enderecoApiClient.find(zipCode);
        return enderecoApiResponseMapper.toAddress(addressResponse);
    }
}
