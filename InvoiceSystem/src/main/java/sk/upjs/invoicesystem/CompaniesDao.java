package sk.upjs.invoicesystem;

import java.util.List;

public interface CompaniesDao {

    public void AddCompany(Company company);

    public List<Company> getCompanies();
}
