
package com.fbiopereira.companybranchescleanarchspringboot3.configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.net.URL;

import static java.nio.charset.Charset.defaultCharset;
import static org.springframework.util.StreamUtils.copyToString;

public class WiremockConfiguration {

    public static WireMockServer build(URL testUrl) {

        return new WireMockServer(testUrl.getPort());
    }

    public static void wireMockClientResponseJsonMock(WireMockServer mockService, String endpoint, int httpStatus, String bodyMock) throws IOException {
        mockService.stubFor(WireMock.get(WireMock.urlEqualTo(endpoint))
                .willReturn(WireMock.aResponse()
                        .withStatus(httpStatus)
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withBody(
                                copyToString(
                                        WireMockServer.class.getClassLoader().getResourceAsStream(bodyMock),
                                        defaultCharset()))));
    }

}


