/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Asking the user to enter their customer id, starting balance and overdraft limit
        // and storing each one of them in a variable
        System.out.print("Please enter a customerID for the savings account: ");
        int cid = input.nextInt();
        System.out.print("Please enter a starting balance for the savings account: ");
        double s_balance = input.nextDouble();
        System.out.print("Please enter the overdraft limit for the savings account: ");
        double odraft = input.nextDouble();
        
        //Creates an object called saving that takes the values from the user
        Saving saving = new Saving(cid,s_balance,odraft);
        
        // Setting boolean value to true
        boolean menu = true;
        
        System.out.println("");
        
        // A do-while loop for 3 menu options
        do
        {
            System.out.println("1. Deposit Amount to Savings Account");
            System.out.println("2. Withdraw Amount from Saving Account");
            System.out.println("3. Exit");
            // Asking the user to choose from 3 options
            System.out.print("Choose a menu option for the savings account: ");
            int options = input.nextInt();
            System.out.println("");
            // If the user enters "1", it will ask the user to enter an amount to deposit
            if(options == 1)
            {
                System.out.print("Please enter an amount to deposit to your savings account: ");
                double dAmount = input.nextDouble();
                System.out.println("");
                saving.deposit(dAmount); // Calling the deposit method
            }
            // If the user enters "2", it will ask the user to enter an amount to withdraw
            else if(options == 2)
            {
                System.out.print("Please enter an amount to withdraw from your savings account: ");
                double wAmount = input.nextDouble();
                System.out.println("");
                saving.withdraw(wAmount); // Calling the withdraw method
            }
            // If the user enters "3", it will exit the program
            else if(options == 3 )
            {
                
                System.exit(0); // exits the program
            }
        }
        while(menu!=false);
    }
    
}
