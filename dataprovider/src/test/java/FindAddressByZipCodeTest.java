import com.fbiopereira.dataprovider.rest.client.EnderecoApiClient;
import com.fbiopereira.dataprovider.rest.mapper.EnderecoApiResponseMapper;
import com.fbiopereira.domain.model.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindAddressByZipCodeTest {

    @Autowired
    private EnderecoApiClient enderecoApiClient;

    @Autowired
    private EnderecoApiResponseMapper enderecoApiResponseMapper;
    @Test
    void find(){

        var addressResponse = enderecoApiClient.find("21361020");
        Address address = enderecoApiResponseMapper.toAddress(addressResponse);

    }
}
