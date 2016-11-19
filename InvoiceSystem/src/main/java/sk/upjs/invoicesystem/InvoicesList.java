package sk.upjs.invoicesystem;

import java.util.*;

public enum InvoicesList implements InvoicesDao {

    INSTANCE;

    private List<Invoice> invoices = new ArrayList<Invoice>();

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void AddInvoice(Invoice invoice) {
        invoices.add(invoice);
    }
   
}
