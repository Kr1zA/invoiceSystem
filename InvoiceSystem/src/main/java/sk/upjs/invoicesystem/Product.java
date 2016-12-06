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
public class Product {

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    private String name;
    private int count;
    private double price;

    public Product(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
}
