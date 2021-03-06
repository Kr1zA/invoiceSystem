/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MongoInvoicesTest {

    public MongoInvoicesTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetInvoices() {

        Company company1 = new Company("KovalM", "Kvacianska", "Kosice", 43242, "Slovensko", 234234L, 234234L, 123456L, "343434", "asd@asd.sd", "34sfasfa");
        Company company2 = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123458L, "343434", "asd@asd.sd", "34sfasfa");
        Invoice invoice = new Invoice(company2, company1, 1, 2320, 1234, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "asd", "fd3434", "asdf", "sad30");
        ObjectId id = new ObjectId();
        invoice.setInvoiceId(id);
        InvoicesDao mongo = ObjectFactory.INSTANCE.getInvoicesDao();
        long size = mongo.size();
        List<Invoice> invoices = mongo.getInvoices();
        mongo.addInvoice(invoice);
        Assert.assertEquals(size, mongo.getInvoices().size() - 1);
        mongo.deleteInvoice(invoice);
    }

    @Test
    public void testAddInvoice() {
        Company company1 = new Company("KovalM", "Kvacianska", "Kosice", 43242, "Slovensko", 234234L, 234234L, 123456L, "343434", "asd@asd.sd", "34sfasfa");
        Company company2 = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123458L, "343434", "asd@asd.sd", "34sfasfa");
        Invoice invoice = new Invoice(company2, company1, 1, 2320, 1234, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "asd", "fd3434", "asdf", "sad30");
        ObjectId id = new ObjectId();
        invoice.setInvoiceId(id);
        InvoicesDao mongo = ObjectFactory.INSTANCE.getInvoicesDao();

        long size = mongo.size();
        mongo.addInvoice(invoice);
        Assert.assertEquals(mongo.size(), size + 1);
        mongo.deleteInvoice(invoice);

    }

    @Test
    public void testDeleteInvoice() {
        Company company1 = new Company("KovalM", "Kvacianska", "Kosice", 43242, "Slovensko", 234234L, 234234L, 123456L, "343434", "asd@asd.sd", "34sfasfa");
        Company company2 = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123458L, "343434", "asd@asd.sd", "34sfasfa");
        Invoice invoice = new Invoice(company2, company1, 1, 2320, 1234, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "asd", "fd3434", "asdf", "sad30");
        ObjectId id = new ObjectId();
        invoice.setInvoiceId(id);
        InvoicesDao mongo = ObjectFactory.INSTANCE.getInvoicesDao();
        mongo.addInvoice(invoice);
        long size = mongo.size();
        mongo.deleteInvoice(invoice);
        Assert.assertEquals(mongo.size(), size - 1);
    }

    @Test
    public void testGet5LastInvoices() {
        InvoicesDao mongo = ObjectFactory.INSTANCE.getInvoicesDao();

        long i = mongo.size();
        if (i > 5) {
            i = 5;
        }
        int size = (int) i;
        List<Invoice> lastFiveInvoices = mongo.get5LastInvoices();
        Assert.assertEquals(lastFiveInvoices.size(), size);
    }

}
