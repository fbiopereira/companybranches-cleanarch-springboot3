package com.fbiopereira.dataprovider.rest.mapper;
import com.fbiopereira.dataprovider.rest.response.EnderecoApiResponse;
import com.fbiopereira.domain.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EnderecoApiResponseMapper {

    @Mapping(source = "enderecoApiResponse.cep", target = "zipCode")
    @Mapping(source = "enderecoApiResponse.rua", target = "address")
    @Mapping(source = "enderecoApiResponse.cidade", target = "city")
    @Mapping(source = "enderecoApiResponse.uf", target = "state")
    Address toAddress(EnderecoApiResponse enderecoApiResponse);
}
