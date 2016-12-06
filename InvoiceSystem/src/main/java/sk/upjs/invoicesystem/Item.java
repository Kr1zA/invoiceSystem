/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

/**
 *
 * @author kriza
 */
public class Item {

    

    public Item(String description, int amount, double pricePerPiece) {
        this.description = description;
        this.amount = amount;
        this.pricePerPiece = pricePerPiece;
    }

    private String description;
    private int amount;
    private double pricePerPiece;
    

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

}
