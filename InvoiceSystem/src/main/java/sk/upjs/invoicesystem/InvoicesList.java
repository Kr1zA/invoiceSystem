package sk.upjs.invoicesystem;

import java.util.*;

public enum InvoicesList implements InvoicesDao {

    INSTANCE;

    private List<Invoice> invoices = new ArrayList<Invoice>();

    private InvoicesList() {
        Company company = new Company("asd","asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123456L, "343434", "asd@asd.sd", "34sfasfa");
        Company company1 = new Company("asd", "asd", "asd", 43242, "Slovensko", 234234L, 234234L, 123458L, "343434", "asd@asd.sd", "34sfasfa");

        Invoice new1 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 28), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        Invoice new2 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 22), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        Invoice new3 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 11), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        Invoice new4 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 2), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        Invoice new5 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 4), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        Invoice new6 = new Invoice(company, company1, 23, 43, 234, new Date(2016 - 1999, Calendar.SEPTEMBER, 24), new Date(2016 - 1999, Calendar.SEPTEMBER, 29), new Date(2016 - 1999, Calendar.SEPTEMBER, 30), "E", "neviem", null, "me");
        this.addInvoice(new6);
        this.addInvoice(new5);
        this.addInvoice(new4);
        this.addInvoice(new3);
        this.addInvoice(new2);
        this.addInvoice(new1);

    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Invoice> get5LastInvoices() {
        List<Invoice> lastInvoices = new ArrayList<Invoice>();
        invoices.sort(new SorterByExposureDate());
        for (int i = 0; i < 5; i++) {
            lastInvoices.add(invoices.get(i));

        }
        return lastInvoices;
    }

    @Override
    public long size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
