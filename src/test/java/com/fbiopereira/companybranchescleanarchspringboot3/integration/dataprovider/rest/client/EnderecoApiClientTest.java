package com.fbiopereira.companybranchescleanarchspringboot3.integration.dataprovider.rest.client;


import com.fbiopereira.companybranchescleanarchspringboot3.configuration.WiremockConfiguration;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.exception.EnderecoApiClientZipCodeNotFoundException;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import com.github.tomakehurst.wiremock.WireMockServer;
import feign.RetryableException;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles({ "test" })
public class EnderecoApiClientTest {

    private WireMockServer wireMockServer;

    @Value("${fbiopereira.enderecoApiClient.apiUrl}")
    String enderecoApiUrl;

    URL enderecoApiUrlObject;

    @Autowired
   private EnderecoApiClient enderecoApiClient;

    @Before
    public void setUp() throws Exception {

        if (wireMockServer == null) {
            enderecoApiUrlObject = new URL(enderecoApiUrl);
            wireMockServer = WiremockConfiguration.build(enderecoApiUrlObject);
        }
        wireMockServer.start();

    }

    @After
    public void finish(){
        if (wireMockServer != null && wireMockServer.isRunning()) {
            wireMockServer.stop();
            wireMockServer.shutdown();
        }
    }


    @Test
    @DisplayName("Integration Test for EnderecoApiClient get Cep with value 01234000")
    public void testEnderecoApiClientGetCep() throws IOException {
       String endpoint = enderecoApiUrlObject.getPath() + "/cep/01234000";
       WiremockConfiguration.wireMockClientResponseJsonMock(wireMockServer, endpoint, HttpStatus.OK.value(), "payload/enderecoApiClient-getCep-01234000.json");
       EnderecoApiResponse enderecoApiResponse = enderecoApiClient.find("01234000");

       assertNotNull(enderecoApiResponse);
       assertEquals("01234-000", enderecoApiResponse.getCep());
       assertEquals("Avenida Pacaembu", enderecoApiResponse.getLogradouro());
       assertEquals("Pacaembu", enderecoApiResponse.getBairro());
       assertEquals("São Paulo", enderecoApiResponse.getCidade());
       assertEquals("SP", enderecoApiResponse.getUf());
       assertEquals(200, enderecoApiResponse.getStatus_http());
       assertNull(enderecoApiResponse.getMensagem());

    }

    @Test
    @DisplayName("Integration Test for EnderecoApiClient get Cep not Found")
    public void testEnderecoApiClientGetCepNotFound() throws IOException {

       String endpoint = enderecoApiUrlObject.getPath() + "/cep/01234000";

        WiremockConfiguration.wireMockClientResponseJsonMock(wireMockServer, endpoint, HttpStatus.NOT_FOUND.value(), "payload/enderecoApiClient-getCep-notFound-01234000.json");

        assertThrows(EnderecoApiClientZipCodeNotFoundException.class, () -> enderecoApiClient.find("01234000"));
    }

    @Test
    @DisplayName("Integration Test for EnderecoApiClient - API Offline")
    public void testEnderecoApiClientOffline() throws IOException {
        String endpoint = enderecoApiUrlObject.getPath() + "/cep/01234000";
        wireMockServer.stop();
        wireMockServer.shutdown();

        assertThrows(RetryableException.class, () -> enderecoApiClient.find("01234000"));


    }

}
