package com.fbiopereira.companybranchescleanarchspringboot3.unit.dataprovider.rest.mapper;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.mapper.EnderecoApiResponseMapper;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import com.fbiopereira.companybranchescleanarchspringboot3.model.Address;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EnderecoApiResponseMapperTest {


    EnderecoApiResponseMapper enderecoApiResponseMapper = Mappers.getMapper(EnderecoApiResponseMapper.class);
    @Test
    @DisplayName("Testing if EnderecoApiResponseMapper mapping is correct")
    void EnderecoApiResponseMapperValidationTest(){

        EnderecoApiResponse enderecoApiResponse = new EnderecoApiResponse();
        enderecoApiResponse.setCep("00000000");
        enderecoApiResponse.setLogradouro("Rua Teste");
        enderecoApiResponse.setCidade("Cidade Teste");
        enderecoApiResponse.setUf("UF Teste");

        Address address = enderecoApiResponseMapper.enderecoApiResponseToAddress(enderecoApiResponse);
        assertEquals(enderecoApiResponse.getCep(), address.getZipCode());
        assertEquals(enderecoApiResponse.getLogradouro(), address.getStreet());
        assertEquals(enderecoApiResponse.getCidade(), address.getCity());
        assertEquals(enderecoApiResponse.getUf(), address.getState());



    }
}
