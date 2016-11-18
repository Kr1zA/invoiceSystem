package sk.upjs.invoicesystem;

import java.util.*;

public class InvoicesList implements InvoicesDAO {

    private List<Invoice> invoices = new ArrayList<Invoice>();

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void AddInvoice(Invoice invoice) {
        invoices.add(invoice);
    }
   
}
