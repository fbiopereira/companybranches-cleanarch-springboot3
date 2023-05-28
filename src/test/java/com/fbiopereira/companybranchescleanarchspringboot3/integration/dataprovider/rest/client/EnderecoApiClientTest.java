package com.fbiopereira.companybranchescleanarchspringboot3.integration.dataprovider.rest.client;


import com.fbiopereira.companybranchescleanarchspringboot3.configuration.WiremockConfiguration;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response.EnderecoApiResponse;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.Before;
import org.junit.Test;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles({ "test" })
public class EnderecoApiClientTest {

    private WireMockServer wireMockServer;

    @Value("${fbiopereira.enderecoApiClient.apiUrl}")
    String enderecoApiUrl;

    @Autowired
   private EnderecoApiClient enderecoApiClient;

    @Before
    public void setUp() throws Exception {
        URL enderecoApiUrlObject = new URL(enderecoApiUrl);
        wireMockServer = WiremockConfiguration.build(enderecoApiUrlObject);

    }


    @Test
    @DisplayName("Integration Test for EnderecoApiClient - get Cep with value 01234000")
    public void testEnderecoApiClientGetCep() throws IOException {
        WiremockConfiguration.wireMockClientResponseMock(wireMockServer, "enderecoApi/cep/01234000", HttpStatus.OK.value(), "payload/enderecoApiClient-getCep-01234000.json");
        wireMockServer.start();
        EnderecoApiResponse enderecoApiResponse = enderecoApiClient.find("01234000");
        assertNotNull(enderecoApiResponse);
    }
}
