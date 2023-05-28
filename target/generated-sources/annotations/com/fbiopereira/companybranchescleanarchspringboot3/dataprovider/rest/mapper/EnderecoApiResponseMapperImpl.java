package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.mapper;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import com.fbiopereira.companybranchescleanarchspringboot3.model.Address;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-28T18:40:36-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4.1 (Microsoft)"
)
public class EnderecoApiResponseMapperImpl implements EnderecoApiResponseMapper {

    @Override
    public Address enderecoApiResponseToAddress(EnderecoApiResponse enderecoApiResponse) {
        if ( enderecoApiResponse == null ) {
            return null;
        }

        Address address = new Address();

        address.setZipCode( enderecoApiResponse.getCep() );
        address.setStreet( enderecoApiResponse.getLogradouro() );
        address.setCity( enderecoApiResponse.getCidade() );
        address.setState( enderecoApiResponse.getUf() );

        return address;
    }
}
