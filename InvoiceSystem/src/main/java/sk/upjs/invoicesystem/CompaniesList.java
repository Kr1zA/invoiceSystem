package sk.upjs.invoicesystem;

import java.util.*;
import org.bson.types.ObjectId;

public enum CompaniesList implements CompaniesDao {

    INSTANCE;

    private List<Company> companies = new ArrayList<Company>();

    private CompaniesList() {
        Company company = new Company("nazovfirmy", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 12345L, "343434", "asd@asd.sd", "34sfasfa");
        Company company1 = new Company("risko", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123465L, "343434", "asd@asd.sd", "34sfasfa");
        addCompany(company);
        addCompany(company1);
    }
    public long size(){
     return 0L;   
    }
    public void addCompany(Company company) {
        companies.add(company);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public Company searchCompanyByCompanyName(String companyName) {
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCompanyName().equals(companyName)) {
                return companies.get(i);
            }
        }
        return null;
    }

    @Override
    public Company searchCompanyById(ObjectId objectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
