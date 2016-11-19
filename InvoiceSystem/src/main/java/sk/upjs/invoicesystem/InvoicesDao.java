package sk.upjs.invoicesystem;

import java.util.List;

public interface InvoicesDao {

    public List<Invoice> getInvoices();

    public void AddInvoice(Invoice invoice);
}
