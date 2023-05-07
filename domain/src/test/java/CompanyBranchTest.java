import com.fbiopereira.domain.model.CompanyBranch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyBranchTest {

    @Test
    void CompanyBranchCreation(){

        CompanyBranch companyBranch = new CompanyBranch();
        assertNull(companyBranch.getBranchId());
        assertNull(companyBranch.getName());
        assertNull(companyBranch.getCompanyBranchType());
        assertEquals(0, companyBranch.getTaxIdentificationNumber());
        assertNull(companyBranch.getZipCode());
        assertNull(companyBranch.getAddress());
        assertNull(companyBranch.getAddressComplement());
        assertNull(companyBranch.getCity());
        assertNull(companyBranch.getState());
        assertTrue(companyBranch.isOperative());
        assertNotNull(companyBranch.getRegisterDate());
        assertNull(companyBranch.getLastUpdated());

    }
}
