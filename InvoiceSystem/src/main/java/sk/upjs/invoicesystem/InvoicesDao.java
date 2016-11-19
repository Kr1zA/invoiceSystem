package sk.upjs.invoicesystem;

import java.util.List;

public interface InvoicesDao {

    public List<Invoice> getInvoices();

    public void addInvoice(Invoice invoice);
    
    public List<Invoice> get5LastInvoices();
}
