/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package assignment3;

/**
 *
 * @author karnb
 */
public abstract class Accounts { // abstract class
    
    // Define Variables
    private int customerID;
    private double balance;
    
    // Argument Constructor
    public Accounts(int customerID, double balance)
    {
        this.customerID = customerID;
        this.balance = balance;
        
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
   
    // Defining withdraw and deposit method
    public abstract void withdraw(double withdraw);
    public abstract void deposit(double deposit);
    
}
