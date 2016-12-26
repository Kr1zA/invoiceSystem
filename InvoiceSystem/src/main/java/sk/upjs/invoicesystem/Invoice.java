package sk.upjs.invoicesystem;

import java.util.Date;
import java.util.*;
import org.bson.types.ObjectId;

public class Invoice {

    public Invoice() {
    }

    private Company supplier;
    private Company customer;
    private ObjectId objectId;
    private Integer invoiceNumber;
    private Integer variableSymbol;
    private Integer constantSymbol;
    private Date exposureDate;
    private Date deliveryDate;
    private Date paymentDueDate;
    private String currency = "";
    private String paymentsForm = "";
    private String note = "";
    private String drewUpBy = "";
    private List<Item> products = new ArrayList<Item>();

    public void setProducts(List<Item> products) {
        this.products = products;
    }

    public List<Item> getProducts() {
        return products;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setVariableSymbol(Integer variableSymbol) {
        this.variableSymbol = variableSymbol;
    }

    public void setConstantSymbol(Integer constantSymbol) {
        this.constantSymbol = constantSymbol;
    }

    public void setExposureDate(Date exposureDate) {
        this.exposureDate = exposureDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setFormOfPayments(String formOfPayments) {
        this.paymentsForm = formOfPayments;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setDrewUpBy(String drewUpBy) {
        this.drewUpBy = drewUpBy;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public Integer getVariableSymbol() {
        return variableSymbol;
    }

    public Integer getConstantSymbol() {
        return constantSymbol;
    }

    public Date getExposureDate() {
        return exposureDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFormOfPayments() {
        return paymentsForm;
    }

    public String getNote() {
        return note;
    }

    public String getDrewUpBy() {
        return drewUpBy;
    }

    public void setSupplier(Company supplier) {
        this.supplier = supplier;
    }

    public void setCustomer(Company customer) {
        this.customer = customer;
    }

    public void setPaymentsForm(String paymentsForm) {
        this.paymentsForm = paymentsForm;
    }

    public Company getSupplier() {
        return supplier;
    }

    public Company getCustomer() {
        return customer;
    }

    public String getPaymentsForm() {
        return paymentsForm;
    }
    
    
    public ObjectId getInvoiceId() {
        return objectId;
    }

    public void setInvoiceId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public Invoice(Company supplier, Company customer, Integer invoiceNumber, Integer variableSymbol, Integer constantSymbol, Date exposureDate, Date deliveryDate, Date paymentDueDate, String currency, String paymentsForm, String note, String drewUpBy) {
        this.supplier = supplier;
        this.customer = customer;
        this.invoiceNumber = invoiceNumber;
        this.variableSymbol = variableSymbol;
        this.constantSymbol = constantSymbol;
        this.exposureDate = exposureDate;
        this.deliveryDate = deliveryDate;
        this.paymentDueDate = paymentDueDate;
        this.currency = currency;
        this.paymentsForm = paymentsForm;
        this.note = note;
        this.drewUpBy = drewUpBy;
    }

    public void addProduct(String name, Integer count, Double pricePerPiece, String unitOfQuantity) {
        Item product = new Item(name, count, pricePerPiece, unitOfQuantity);
        products.add(product);

    }
}
