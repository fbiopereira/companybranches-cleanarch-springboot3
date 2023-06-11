package com.fbiopereira.companybranchescleanarchspringboot3.service;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.companybranchescleanarchspringboot3.core.model.Address;
import com.fbiopereira.companybranchescleanarchspringboot3.core.usecase.FindAddressByZipCode;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.mapper.EnderecoApiResponseMapper;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private EnderecoApiClient enderecoApiClient;


    @Override
    public Address find(String zipCode) {

        EnderecoApiResponse enderecoApiClientResponse = enderecoApiClient.find(zipCode);
        EnderecoApiResponseMapper enderecoApiResponseMapper = Mappers.getMapper(EnderecoApiResponseMapper.class);

        Address address = enderecoApiResponseMapper.enderecoApiResponseToAddress(enderecoApiClientResponse);

        return address;
    }
}
