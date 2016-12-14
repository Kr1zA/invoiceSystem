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
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marosi
 */
public class MongoInvoices implements InvoicesDao {

    private DBCollection mongo;

    public MongoInvoices(DBCollection mongo) {
        this.mongo = mongo;
    }

    @Override
    public List<Invoice> getInvoices() {
        List<Invoice> invoices = new ArrayList<Invoice>();
        DBCursor cursor = mongo.find();

        while (cursor.hasNext()) {
            Invoice invoice = new Invoice();
            DBObject theone = cursor.next();
            ObjectId object = (ObjectId) theone.get("supplier");
            invoice.setSupplier(ObjectFactory.INSTANCE.getCompanyDao().searchCompanyById(object));
            invoice.setCustomer(ObjectFactory.INSTANCE.getCompanyDao().searchCompanyById((ObjectId) theone.get("customer")));
            invoice.setInvoiceNumber((int) theone.get("invoiceNumber"));
            invoice.setConstantSymbol((int) theone.get("variableSymbol"));
            invoice.setExposureDate((Date) theone.get("exposureDate"));
            invoice.setDeliveryDate((Date) theone.get("deliveryDate"));
            invoice.setPaymentDueDate((Date) theone.get("paymentDueDate"));
            invoice.setCurrency((String) theone.get("currency"));
            invoice.setPaymentsForm((String) theone.get("paymentsForm"));
            invoice.setNote((String) theone.get("note"));
            invoice.setDrewUpBy((String) theone.get("drewUpBy"));
            invoice.setInvoiceId((ObjectId) theone.get("_id"));
            List<Item> stored = ObjectFactory.INSTANCE.getItemsDao().getItemsById(invoice.getInvoiceId());

            invoice.setProducts(stored);
            invoices.add(invoice);

        }
        return invoices;
    }

    @Override
    public void addInvoice(Invoice invoice) {

        BasicDBObject doc = new BasicDBObject("_id", invoice.getInvoiceId())
                .append("invoiceNumber", invoice.getInvoiceNumber())
                .append("supplier", invoice.getSupplier().getIdCompany())
                .append("customer", invoice.getCustomer().getIdCompany())
                .append("variableSymbol", invoice.getVariableSymbol())
                .append("constantSymbol", invoice.getInvoiceNumber())
                .append("exposureDate", invoice.getExposureDate())
                .append("deliveryDate", invoice.getDeliveryDate())
                .append("paymentDueDate", invoice.getPaymentDueDate())
                .append("currency", invoice.getCurrency())
                .append("paymentsForm", invoice.getPaymentsForm())
                .append("note", invoice.getNote())
                .append("drewUpBy", invoice.getDrewUpBy());
        mongo.insert(doc);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        BasicDBObject doc = new BasicDBObject();

        doc.append("$set", new BasicDBObject().append("invoiceNumber", invoice.getInvoiceNumber())
                .append("supplier", invoice.getSupplier().getIdCompany())
                .append("customer", invoice.getCustomer().getIdCompany())
                .append("variableSymbol", invoice.getVariableSymbol())
                .append("constantSymbol", invoice.getInvoiceNumber())
                .append("exposureDate", invoice.getExposureDate())
                .append("deliveryDate", invoice.getDeliveryDate())
                .append("paymentDueDate", invoice.getPaymentDueDate())
                .append("currency", invoice.getCurrency())
                .append("paymentsForm", invoice.getPaymentsForm())
                .append("note", invoice.getNote())
                .append("drewUpBy", invoice.getDrewUpBy()));

        BasicDBObject searchQuery = new BasicDBObject().append("_id", invoice.getInvoiceId());
        mongo.update(searchQuery, doc);
    }

    @Override
    public List<Invoice> get5LastInvoices() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long size() {
        return mongo.getCount();
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        ObjectId objectId = invoice.getInvoiceId();
        BasicDBObject query = new BasicDBObject("_id", objectId);
        DBObject theone = mongo.findOne(query);
        mongo.remove(theone);
        ItemsDao mongoIt = ObjectFactory.INSTANCE.getItemsDao();
        mongoIt.deleteItems(objectId);
    }

}
