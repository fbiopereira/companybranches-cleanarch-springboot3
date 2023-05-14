import com.fbiopereira.dataprovider.SpringDataProviderApplication;
import com.fbiopereira.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.dataprovider.rest.mapper.EnderecoApiResponseMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import enderecoapi.EnderecoApiCepMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import testconfiguration.WireMockConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest (classes = SpringDataProviderApplication.class)
@ActiveProfiles("test")
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WireMockConfig.class })
public class FindAddressByZipCodeTest {


    @Autowired
    private WireMockServer enderecoApiMock;

    @Autowired
    private EnderecoApiClient enderecoApiClient;

    @Autowired
    private EnderecoApiResponseMapper enderecoApiResponseMapper;
    @Test
    void find() throws Exception{

        EnderecoApiCepMock.setupMockEnderecoApiResponse(enderecoApiMock);

        var addressResponse = enderecoApiClient.find("21361020");
        assertNotNull(addressResponse.getCep());
    }
}
