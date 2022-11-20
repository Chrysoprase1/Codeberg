/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class Product {
    private String name;
    private double price;
    private int initialQuantity;
    
    public Product (String name, double price, int initialQuantity) {
        this.name = name;
        this.price = price;
        this.initialQuantity = initialQuantity;
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + initialQuantity
        + " pcs");
    }
    
}
