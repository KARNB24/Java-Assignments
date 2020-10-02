/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package assignment2;

/**
 *
 * @author karnb
 */
public class BaseCommission extends Commission { // Sub class named BaseCommission which inherit properties of superclass
    
    // Define the variable
    private double basicsalary;
    
    // Argument Constructor
    public BaseCommission(String firstname, String lastname, int ssn, double grosssales, double commrate, double basicsalary) {
        super(firstname, lastname, ssn, grosssales, commrate); // To call superclass argument constructor
        this.basicsalary = basicsalary;
    }

    /**
     * @return the basicsalary
     */
    public double getBasicsalary() {
        return basicsalary;
    }

    /**
     * @param basicsalary the basicsalary to set
     */
    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }
    
    // A method named countSalary which calculates the salary of the employee
    public double countSalary()
    {
        return basicsalary + earning();
    }
    
    // A method named toString which displays the output
    public String toString()
    {
        return super.toString()+"Employee Basic Salary: "+basicsalary+"\n\n"+"Employee Earning: "+earning()+"\n\n"+"Employee Salary: "+countSalary();
    }
    
    
    
    
}
