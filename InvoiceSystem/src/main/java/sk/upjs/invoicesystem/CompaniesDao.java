package sk.upjs.invoicesystem;

import java.util.List;


public interface CompaniesDao {

    public void addCompany(Company company);

    public List<Company> getCompanies();
    
    public Company searchCompanyByCompanyName(String companyName);
    
    public Company searchCompanyById(String objectId);
    
    public long size();
}
