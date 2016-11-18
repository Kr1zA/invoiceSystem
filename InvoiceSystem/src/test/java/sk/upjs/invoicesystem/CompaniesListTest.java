package sk.upjs.invoicesystem;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompaniesListTest {

    public CompaniesListTest() {
    }

    @Test
    public void testAddInvoice() {
        CompaniesList companiesList = new CompaniesList();
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, true, "343434", "asd@asd.sd", "34sfasfa");
        int companiesCount = companiesList.getCompanies().size();
        companiesList.AddCompany(company);
        Assert.assertEquals(companiesCount + 1, companiesList.getCompanies().size());
    }

}
