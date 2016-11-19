package sk.upjs.invoicesystem;

import java.util.Date;
import java.util.*;

public class Invoice {

    private Company supplier;
    private Company customer;

    private int invoiceNumber;
    private int variableSymbol;
    private int constantSymbol;
    private Date exposureDate;
    private Date deliveryDate;
    private Date paymentDueDate;
    private String currency;
    private String paymentsForm;
    private String note;
    private String drewUpBy;
    private List<Item> items = new ArrayList<Item>();

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setVariableSymbol(int variableSymbol) {
        this.variableSymbol = variableSymbol;
    }

    public void setConstantSymbol(int constantSymbol) {
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

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getVariableSymbol() {
        return variableSymbol;
    }

    public int getConstantSymbol() {
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

    public List<Item> getItems() {
        return items;
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

    public Invoice(Company supplier, Company customer, int invoiceNumber, int variableSymbol, int constantSymbol, Date exposureDate, Date deliveryDate, Date paymentDueDate, String currency, String paymentsForm, String note, String drewUpBy) {
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

   
    

    private class Item {

        private String title;
        private int count;
        private double pricePerPiece;

        public Item(String title, int count, double pricePerPiece) {
            this.title = title;
            this.count = count;
            this.pricePerPiece = pricePerPiece;
        }

    }

    public void addItem(String title, int count, double pricePerPiece) {
        Item item = new Item(title, count, pricePerPiece);
        items.add(item);
    }
}
