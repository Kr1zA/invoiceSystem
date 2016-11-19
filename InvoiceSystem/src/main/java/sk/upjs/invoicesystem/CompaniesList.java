package sk.upjs.invoicesystem;

import java.util.*;

public enum CompaniesList implements CompaniesDao {

    INSTANCE;

    private List<Company> companies = new ArrayList<Company>();

    public void AddCompany(Company company) {
        companies.add(company);
    }

    public List<Company> getCompanies() {
        return companies;
    }

}
