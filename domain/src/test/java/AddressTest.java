import com.fbiopereira.domain.model.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    void AddressCreation(){

        Address address = new Address();
        assertNull(address.getZipCode());
        assertNull(address.getAddress());
        assertNull(address.getAddressComplement());
        assertNull(address.getCity());
        assertNull(address.getState());
    }

}
