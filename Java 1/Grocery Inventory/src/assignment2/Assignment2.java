/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Assignment 2: Assignment2.java 
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Asks the user to enter the number of items in store and stores it in a variable called noitems as type int
        System.out.print("Enter number of items in store: ");
        int noitems = input.nextInt();
        System.out.println();
        
        // Declares an array list
        int [] itemlist = new int[noitems];
        int [] quantitylist = new int[noitems];
        double [] pricelist = new double[noitems];
        String [] namelist = new String[noitems];
        double finalTotal = 0;
        
        // This for loop runs until the entered number of items. ex, if the user enter 3 as the number of items, the loop will run 3 times
        for (int i=0; i<noitems; i++)
        {
            // Asks the user to enter the quantity of item and stores it in a variable called quantity
            // Then it assigns to a array list
            System.out.print("Enter quantity of item: ");
            int quantity = input.nextInt();
            quantitylist[i] = quantity;
            
            System.out.println();
            
            System.out.print("Enter price of item: ");
            int price = input.nextInt();
            pricelist[i] = price;
            
            System.out.println();
            
            System.out.print("Enter item name: ");
            String name = input.next();
            namelist[i] = name;
            
            System.out.println();           
            
        }
        // Prints the header of the output
        System.out.println("ItemName\tQuantity\tUnit Price\tTotal");
        System.out.println();
        
        // This for loop outputs the given items in a table format
        for (int i=0; i<noitems; i++)
        {
            double Total = quantitylist[i] * pricelist[i];
           
            System.out.println(namelist[i] + "       \t"+quantitylist[i]+"     \t\t$"+pricelist[i]+"        \t$"+Total);
        
            finalTotal += Total;
        }
        
        System.out.println();
        // Outputs the final total
        System.out.println("Final total      \t\t\t\t$"+finalTotal); 

        
        
    }
    
}
