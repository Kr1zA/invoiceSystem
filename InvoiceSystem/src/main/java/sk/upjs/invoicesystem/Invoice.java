package sk.upjs.invoicesystem;

import java.util.Date;
import java.util.*;

public class Invoice {

    private int invoiceNumber;
    private int variableSymbol;
    private int constantSymbol;
    private Date exposureDate;
    private Date deliveryDate;
    private Date paymentDueDate;
    private String currency;
    private String formOfPayments;
    private String note;
    private String drewUpBy;
    private List<Item> items = new ArrayList<Item>();

    public Invoice(int invoiceNumber, int variableSymbol, int constantSymbol, Date exposureDate, Date deliveryDate, Date paymentDueDate, String currency, String formOfPayments, String note, String drewUpBy) {
        this.invoiceNumber = invoiceNumber;
        this.variableSymbol = variableSymbol;
        this.constantSymbol = constantSymbol;
        this.exposureDate = exposureDate;
        this.deliveryDate = deliveryDate;
        this.paymentDueDate = paymentDueDate;
        this.currency = currency;
        this.formOfPayments = formOfPayments;
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
