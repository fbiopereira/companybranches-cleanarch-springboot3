package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.mapper;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import com.fbiopereira.companybranchescleanarchspringboot3.core.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EnderecoApiResponseMapper {

    @Mapping(source = "enderecoApiResponse.cep", target = "zipCode")
    @Mapping(source = "enderecoApiResponse.logradouro", target = "street")
    @Mapping(source = "enderecoApiResponse.cidade", target = "city")
    @Mapping(source = "enderecoApiResponse.uf", target = "state")
    Address enderecoApiResponseToAddress(EnderecoApiResponse enderecoApiResponse);
}
