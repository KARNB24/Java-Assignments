/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package testbook;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create an object named Book that take default values
        book Book = new book();
        // Displays the output
        System.out.println("From default constructor:");
        System.out.println("Book name: "+Book.getBname());
        System.out.println("Book Quantity: "+Book.getQuantity());
        System.out.println("Book Price: $"+Book.getPrice());
        System.out.println("Total Price: $"+Book.getTprice());
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        // Asks the user to enter book name, quantity and price and storing them into their variables
        System.out.println("From argument constructor");
        System.out.print("Enter Book Name: ");
        String bname = input.next();
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.println("");
        
        // Creates an object named Book1 that takes values from user
        book Book1 = new book(bname, quantity, price);
        
        //Displaying the ouput from user input
        System.out.println("Book name: "+Book1.getBname());
        System.out.println("Book Quantity: "+Book1.getQuantity());
        System.out.println("Book Price: $"+Book1.getPrice());
        System.out.println("Total Price: $"+Book1.getTprice());
    }
    
}
