/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Assignment 3: Assignment3.java 
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
        
        // Asking users to enter their Account ID, Balance, AIR, amount to be withdran and amount to deposit to balance
        // And storing them in their variables
        System.out.print("Please enter your Account ID: ");
        int id = input.nextInt();
        System.out.println();
        System.out.print("Please enter your Balance: $");
        double balance = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the Annual Interest Rate: ");
        double annualinterestrate = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount to be withdrawn: $");
        double WithDrawn = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount to be deposit to balance: $");
        double Deposit = input.nextDouble();
        System.out.println();
        
        // Creates an object named account
        Account account = new Account(id, balance, annualinterestrate);
        // Displaying the output
        System.out.println("---------------------------------------------------------");
        System.out.println("Account ID: "+account.getID());
        System.out.println("Your balance right now is: $"+account.getBalance());
        System.out.println("Your annual interest rate is: "+account.getAnnualInterestRate()+"%");
        System.out.println("---------------------------------------------------------");
        account.withdraw(WithDrawn);
        System.out.println("Your balance after withdraw is: $"+account.getBalance());
        account.deposit(Deposit);
        System.out.println("Your balance after deposit is: $"+account.getBalance());
        System.out.println("Your monthly interest is: "+account.getMonthlyInterest()+"%");
        System.out.println("----------------------------------------------------------");
        System.out.println("Your final balance is: $"+account.getFinalBalance());
    }
    
    
    
}


