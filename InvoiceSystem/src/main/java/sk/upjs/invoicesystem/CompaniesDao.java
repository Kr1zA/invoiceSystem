package sk.upjs.invoicesystem;

import java.util.List;
import org.bson.types.ObjectId;


public interface CompaniesDao {

    public void addCompany(Company company);
    
    public void deleteCompany(Company company);

    public List<Company> getCompanies();
    
    public Company searchCompanyByCompanyName(String companyName);
    
    public Company searchCompanyById(ObjectId objectId);
    
    public long size();
    
    public List<Company> searchCompanyByNameInList(String companyName);
}
