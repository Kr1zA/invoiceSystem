package sk.upjs.invoicesystem;

import java.util.List;

public interface InvoicesDao {
    //dostanem list vsetkych faktur
    public List<Invoice> getInvoices();
    //pridam fakturu
    public void addInvoice(Invoice invoice);
    //vymazem fakturu
    public void deleteInvoice(Invoice invoice);
    //update faktury
    public void updateInvoice(Invoice invoice);
    
    public List<Invoice> get5LastInvoices();
      
    public long size();
}
