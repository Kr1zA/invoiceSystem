package sk.upjs.invoicesystem;

import java.util.List;

public interface CompaniesDao {

    public void addCompany(Company company);

    public List<Company> getCompanies();
    
    public Company searchCompany(String companyName);
    
    public long size();
}
