/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import junit.framework.Assert;
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
        Company company = new Company("asd","asd", "asd", 43242, "Slovensko", 234234L, 234234L, 46579L, "343434", "asd@asd.sd", "34sfasfa");
        CompaniesDao mongo = new CompaniesFactory().getCompanyDao();
        long daco=mongo.size();
        mongo.addCompany(company);
        Assert.assertEquals(mongo.size(),daco+1);
    }

    @Test
    public void testGetCompanies() {
        CompaniesDao mongo = new CompaniesFactory().getCompanyDao();
        
    }

    @Test
    public void testSearchCompany_String() {
         CompaniesDao mongo = new CompaniesFactory().getCompanyDao();
         Company company=mongo.searchCompany("asd");
         System.out.println(company.getCountry());
         Assert.assertEquals("Slovensko",company.getCountry());
    }

    @Test
    public void testSearchCompany_String_String() {
    }
    
}
