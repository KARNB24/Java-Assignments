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
public class Saving extends Accounts { // superclass
    
    // Define the variable
    private double overdraftAmount;
    
    // Argument constructor
    public Saving(int customerID, double balance,double overdraftAmount) {
        super(customerID, balance);
        this.overdraftAmount = overdraftAmount;
       
    }

    /**
     * @return the overdraftAmount
     */
    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    /**
     * @param overdraftAmount the overdraftAmount to set
     */
    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
    
    
    // A method named deposit
    public void deposit(double deposit)
    {
        double final_bal = getBalance() + deposit; 
        System.out.println("Amount of $"+deposit+" deposited to account");
        System.out.println("Current account balance after deposited is $"+final_bal);
        setBalance(final_bal); // Setting the final balance
        System.out.println("");
    }
    
    // A method named withdraw
    public void withdraw(double withdraw)
    {
        if(withdraw < getBalance())
        {
            double final_bal= getBalance() - withdraw; 
            System.out.println("Amount of $"+withdraw+" successfully withdrawn");
            System.out.println("Current account balance after withdraw is $"+final_bal);
            System.out.println("Current overdraft balance is $"+overdraftAmount);
            setBalance(final_bal);
            System.out.println("");
        }
        else if (withdraw == getBalance()+overdraftAmount)
        {
            double final_bal=getBalance()-withdraw;
            double over_amnt=final_bal+overdraftAmount;
            System.out.println("Current account balance after withdraw is $0.0");
            System.out.println("Current overdraft balance is $"+over_amnt);
            setBalance(over_amnt);
            System.out.println("");
        }
        else if(withdraw > getBalance() + overdraftAmount)
        {
            System.out.println("Insufficient funds to complete transaction");
            System.out.println("Current account balance is $0.0");
            System.out.println("");
        }
        else
        {
            
            double final_bal=getBalance()-withdraw;
            double over_amnt=final_bal+overdraftAmount;
            System.out.println("Overdraft funds required for transaction");
            System.out.println("Amount of $"+withdraw+" successfully withdrawn");
            System.out.println("Current account balance is $0.0");
            System.out.println("Current overdraft balance is $"+over_amnt+" and your original overdraft limit was $"+overdraftAmount);
            setBalance(final_bal);
            System.out.println("");
        }
    }   
}
