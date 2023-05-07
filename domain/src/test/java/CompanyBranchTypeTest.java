import com.fbiopereira.domain.enums.CompanyBranchType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyBranchTypeTest {

    @Test
    void CompanyBranchValidateDescription(){

        assertEquals("CD", CompanyBranchType.Deposit.toString());
        assertEquals("LOJA", CompanyBranchType.Store.toString());
        assertEquals("ONLINE", CompanyBranchType.Online.toString());

    }
}
