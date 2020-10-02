/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
*/

package assignment7;

/**
 *
 * @author karnb
 */
public class Book {
    
    private String bookname, author;
    private int quantity;
    private double price;
    
    public Book()
    {
        
    }

    public Book(String bookname, String author, int quantity, double price) {
        this.bookname = bookname;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
