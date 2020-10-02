/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package testbook;

/**
 *
 * @author karnb
 */
public class book {
    
    // Define Variables
    private String bname;
    private int quantity;
    private double price;
    
    // no-argument constructor with default values
    public book()
    {
        bname = "java";
        quantity = 10;
        price = 50.5;
    }
    
    // argument constructor
    public book(String bname, int quantity, double price)
    {
        this.bname = bname;
        this.quantity = quantity;
        this.price = price;
    }
    
    // accesor/mutator methods for book name, quantity and price
    public String getBname()
    {
        return this.bname;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public void setBname(String bname)
    {
        this.bname = bname;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    // A method that calculates the total price of the book
    public double getTprice()
    {
        return quantity * price;
    }
}
