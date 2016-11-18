package sk.upjs.invoicesystem;

import java.util.List;

public interface CompaniesDAO {

    public void AddCompany(Company company);

    public List<Company> getCompanies();
}
