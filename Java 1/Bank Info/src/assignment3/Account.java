/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Assignment 3: Account.java 
 */
package assignment3;

/**
 *
 * @author karnb
 */
class Account {
        // Define variables
        private int ID;
        private double Balance; // balance for account
        private double AnnualInterestRate; // stores the current interest rate
        
        // no argument constructor
        public Account () {
            ID = 0;
            Balance = 0.0;
            AnnualInterestRate = 0.0;
        }
        
        // constructor with specific id and intial balance
        public Account (int newID, double newBalance, double newAnnualInterestRate) {
            this();
            this.ID = newID;
            this.Balance = newBalance;
            this.AnnualInterestRate = newAnnualInterestRate;
        }
        
        // accessor/mutator methods for ID, Balance and AnnualInterestRate
        public int getID() {
            return this.ID;
        }
        
        public double getBalance() {
            return this.Balance;
        }
        
        public double getAnnualInterestRate() {
            return this.AnnualInterestRate;
        }
        
        public void setID(int newID) {
            this.ID = newID;
        }
        
        public void setBalance(double newBalance) {
            this.Balance = newBalance;
        }
        
        public void setAnnualInterestRate(double newAnnualInterestRate) {
            this.AnnualInterestRate = newAnnualInterestRate;
        }
        
        // defines method getMonthlyInterestRate
        public double getMonthlyInterestRate() {
            return (AnnualInterestRate / 100) / 12;
        }
        
        // method that calculates the monthly interest
        public double getMonthlyInterest() {
            return Balance * getMonthlyInterestRate();
        }
        
        // defines method withdraw
        public void withdraw(double Amount) {
            this.Balance -= Amount;
        }
        
        // define method deposit
        public void deposit(double Amount) {
            this.Balance += Amount;
        }
        
        // defines method getFinalBalance to caluculate the final balance
        public double getFinalBalance () {
            return this.Balance + getMonthlyInterest();
        }
}
