package sk.upjs.invoicesystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class InvoicesListTest {

    public InvoicesListTest() {
    }

    @Test
    public void testAddingInvoice() {
        Company company = new Company("asd", "", "", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, true, "343434", "asd@asd.sd", "34sfasfa");
        Company company1 = new Company("asd", "", "", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, true, "343434", "asd@asd.sd", "34sfasfa");

        InvoicesList invoices = InvoicesList.INSTANCE;
        Invoice invoice = new Invoice(company, company1, 231, 323, 323, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 28), "€", "jak pridze", null, "me");
        invoice.addItem("vsetko", 9, 300);
        invoice.addItem("vsetko", 9, 300);

        int invoicesCount = invoices.getInvoices().size();
        invoices.addInvoice(invoice);

        Assert.assertEquals(2, invoices.getInvoices().get(6).getItems().size());
        Assert.assertEquals(invoicesCount + 1, invoices.getInvoices().size());

    }

    @Test
    public void testGet5LastInvoices() {
        InvoicesList invoices = InvoicesList.INSTANCE;
        List<Invoice> last5invoices = invoices.get5LastInvoices();

        Assert.assertEquals(5, last5invoices.size());
        for (int i = 0; i < last5invoices.size(); i++) {
            System.out.println(last5invoices.get(i).getExposureDate());

        }

    }

}
