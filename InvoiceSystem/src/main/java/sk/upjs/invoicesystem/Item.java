package sk.upjs.invoicesystem;

import org.bson.types.ObjectId;

public class Item {

    public Item() {
    }

    public Item(String description, Integer amount, double pricePerPiece, String unitOfQuantity) {
        this.description = description;
        this.amount = amount;
        this.pricePerPiece = pricePerPiece;
        this.unitOfAmount = unitOfQuantity;
    }

    private String description;
    private Integer amount;
    private Double pricePerPiece;
    private ObjectId invoiceId;
    private String unitOfAmount;

    public String getUnitOfAmount() {
        return unitOfAmount;
    }

    public void setUnitOfAmount(String unitOfQuantity) {
        this.unitOfAmount = unitOfQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPricePerPiece() {
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
