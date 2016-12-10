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
        Assert.assertEquals(mongo.size(), daco + 1);
    }

    @Test
    public void testGetCompanies() {
        Company company = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        List<Company> companies = mongo.getCompanies();
        mongo.addCompany(company);
        Assert.assertEquals(mongo.getCompanies().size(), companies.size() + 1);

    }

    @Test
    public void testSearchCompanyByCompanyName() {
        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        Company company = mongo.searchCompanyByCompanyName("asd");
        System.out.println(company.getCountry());
        Assert.assertEquals("Slovensko", company.getCountry());
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testSearchCompanyById() {

        CompaniesDao mongo = ObjectFactory.INSTANCE.getCompanyDao();
        ObjectId id = new ObjectId("584b1cb4f514e3288301d424");
        Company company = mongo.searchCompanyById(id);
        System.out.println(company.getCountry());
        Assert.assertEquals("Slovensko", company.getCountry());
    }

}
