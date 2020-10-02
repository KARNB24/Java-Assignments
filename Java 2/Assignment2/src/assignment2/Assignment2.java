/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
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
        
        // Asks the user to enter thier first and last name, SIN number, Gross sales, Commission Rate, and Basic salary 
        // and storing each one of them in a variable
        System.out.print("Please enter your first name: ");
        String fname = input.next();
        System.out.print("Please enter your last name: ");
        String lname = input.next();
        System.out.print("Please enter your SIN Number: ");
        int ssn = input.nextInt();
        System.out.print("Please enter your Gross Sales: ");
        double gsales = input.nextDouble();
        System.out.print("Please enter your Commission Rate: ");
        double crate = input.nextDouble();
        System.out.print("Please enter your Basic Salary: ");
        double bsalary = input.nextDouble();
        System.out.println("");
        
        // Creates an object named bcomm that takes the values from the user
        BaseCommission bcomm = new BaseCommission(fname, lname, ssn, gsales, crate, bsalary);
        
        // Calls the toString method
        System.out.println(bcomm.toString());
        
    }
    
}
