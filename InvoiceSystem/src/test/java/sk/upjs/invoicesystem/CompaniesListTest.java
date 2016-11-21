package sk.upjs.invoicesystem;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompaniesListTest {

    public CompaniesListTest() {
    }

    @Test
    public void testAddInvoice() {
        CompaniesList companiesList = CompaniesList.INSTANCE;
        Company company = new Company("asd","","", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 13546L, "343434", "asd@asd.sd", "34sfasfa");
        int companiesCount = companiesList.getCompanies().size();
        companiesList.addCompany(company);
        Assert.assertEquals(companiesCount + 1, companiesList.getCompanies().size());
    }

    @Test
    public void testSearchCompany() {
        Assert.assertEquals(CompaniesList.INSTANCE.searchCompany("asd"), CompaniesList.INSTANCE.getCompanies().get(2));
        Assert.assertEquals(CompaniesList.INSTANCE.searchCompany("meno", "priezvisko"), CompaniesList.INSTANCE.getCompanies().get(1));
    }

}
