package sk.upjs.invoicesystem;

import org.bson.types.ObjectId;


public class Item {

    public Item() {
    }

    public Item(String description, int amount, double pricePerPiece) {
        this.description = description;
        this.amount = amount;
        this.pricePerPiece = pricePerPiece;
       
    }

    private String description;
    private int amount;
    private double pricePerPiece;
    private ObjectId invoiceId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public ObjectId getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(ObjectId invoiceId) {
        this.invoiceId = invoiceId;
    }
    
}
