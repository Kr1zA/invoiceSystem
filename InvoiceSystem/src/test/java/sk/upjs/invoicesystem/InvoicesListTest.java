/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kriza
 */
public class InvoicesListTest {

    public InvoicesListTest() {
    }

    @Test
    public void testAddingInvoice() {
        InvoicesList invoices = new InvoicesList();
        Invoice invoice = new Invoice(231, 323, 323, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 28), "€", "jak pridze", null, "me");
        invoice.addItem("vsetko", 9, 300);
        invoice.addItem("vsetko", 9, 300);

        int invoicesCount = invoices.getInvoices().size();
        invoices.AddInvoice(invoice);
        Assert.assertEquals(invoicesCount + 1, invoices.getInvoices().size());
    }

}
