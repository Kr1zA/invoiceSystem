/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import java.util.List;
import junit.framework.Assert;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//sprosty git
/**
 *
 * @author marosi
 */
public class MongoCompaniesTest {

    public MongoCompaniesTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testAddCompany() {
        Company company = new Company("asd2", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        long daco = mongo.size();
        mongo.addCompany(company);
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());
        Assert.assertEquals(mongo.size(), daco + 1);
        mongo.deleteCompany(company);
    }

    @Test
    public void testGetCompanies() {
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        List<Company> companies = mongo.getCompanies();
        mongo.addCompany(company);
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());

        Assert.assertEquals(mongo.getCompanies().size(), companies.size() + 1);

        mongo.deleteCompany(company);

    }

    @Test
    public void testSearchCompanyByCompanyName() {
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");

        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        List<Company> companies = mongo.getCompanies();
        mongo.addCompany(company);
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());
        Company company1 = mongo.searchCompanyByCompanyName("asd");

        Assert.assertEquals("Slovensko", company1.getCountry());
        mongo.deleteCompany(company);
    }

    @Test
    public void testSearchCompanyById() {
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        mongo.addCompany(company);
        List<Company> companies = mongo.getCompanies();
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());
        Company company1 = mongo.searchCompanyById(company.getIdCompany());
        Assert.assertEquals("Slovensko", company1.getCountry());
        mongo.deleteCompany(company);
    }

    @Test
    public void testDeleteCompany() {
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        mongo.addCompany(company);
        long size = mongo.size();
        List<Company> companies = mongo.getCompanies();
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());
        mongo.deleteCompany(company);
        Assert.assertEquals(size-1, mongo.size());
       

    }

    @Test
    public void testUpdateCompany(){ 
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        mongo.addCompany(company);
        List<Company> companies = mongo.getCompanies();
        company = mongo.searchCompanyByCompanyName(company.getCompanyName());
        company.setCompanyName("ide to");
        mongo.updateCompany(company);
        Company company1 = mongo.searchCompanyById(company.getIdCompany());
        Assert.assertEquals("ide to", company1.getCompanyName());
        mongo.deleteCompany(company);   
        
    }

}
