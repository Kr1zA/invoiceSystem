/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marosi
 */
public class MongoInvoices implements InvoicesDao{

    
    private DBCollection mongo;
    
    public MongoInvoices(DBCollection mongo) {
        this.mongo = mongo;
    }

    @Override
    public List<Invoice> getInvoices() {
       List<Invoice> invoices = new ArrayList<Invoice>();
        DBCursor cursor = mongo.find();
        

        while(cursor.hasNext()){
            Invoice invoice = new Invoice();
            DBObject theone= cursor.next();
            
            invoice.setSupplier(ObjectFactory.INSTANCE.getCompanyDao().searchCompanyById((String)theone.get("_id")));
            invoice.setCustomer(ObjectFactory.INSTANCE.getCompanyDao().searchCompanyById((String)theone.get("_id")));
            invoice.setInvoiceNumber((int)theone.get("invoiceNumber"));
            invoice.setConstantSymbol((int)theone.get("variablesNumber"));
            //invoice.setExposureDate(exposureDate);
            //invoice.setDeliveryDate(deliveryDate);
            //invoice.setPaymentDueDate(paymentDueDate);
            invoice.setCurrency((String)theone.get("currency"));
            invoice.setPaymentsForm((String)theone.get("paymentsForm"));
            invoice.setNote((String)theone.get("note"));
            invoice.setDrewUpBy((String)theone.get("drewUpBy"));
            invoices.add(invoice);
        }
        return invoices;
    }

    @Override
    public void addInvoice(Invoice invoice) {
        BasicDBObject doc =  new BasicDBObject("invoiceNumber",invoice.getInvoiceNumber())
                .append("supplier", invoice.getSupplier().getIdCompany())
                .append("customer", invoice.getCustomer().getIdCompany())
                .append("variableSymbol", invoice.getVariableSymbol())
                .append("constantSymbol",invoice.getInvoiceNumber())
                .append("exposureDate",invoice.getExposureDate())
                .append("deliveryDate", invoice.getDeliveryDate())
                .append("paymentDueDate", invoice.getPaymentDueDate())
                .append("currency",invoice.getCurrency())
                .append("paymentsForm",invoice.getPaymentsForm())
                .append("note",invoice.getNote())
                .append("drewUpBy",invoice.getDrewUpBy());
        mongo.insert(doc);
    }

    @Override
    public List<Invoice> get5LastInvoices() {
       throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public long size() {
        return mongo.getCount();
    }
    
}
