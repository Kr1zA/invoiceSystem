package sk.upjs.invoicesystem;

import java.util.*;

public class CompaniesList implements CompaniesDAO  {

    private List<Company> companies = new ArrayList<Company>();

    public void AddCompany(Company company) {
        companies.add(company);
    }

    public List<Company> getCompanies() {
        return companies;
    }

}
