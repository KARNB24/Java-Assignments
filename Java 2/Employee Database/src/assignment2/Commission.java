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
public class Commission { // Super class named Commission
    
    // Define Variables
    private String firstname;
    private String lastname;
    private int ssn;
    private double grosssales;
    private double commrate;
    
    // Argument Constructor 
    public Commission(String firstname, String lastname, int ssn, double grosssales, double commrate)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.grosssales = grosssales;
        this.commrate = commrate;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the ssn
     */
    public int getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the grosssales
     */
    public double getGrosssales() {
        return grosssales;
    }

    /**
     * @param grosssales the grosssales to set
     */
    public void setGrosssales(double grosssales) {
        this.grosssales = grosssales;
    }

    /**
     * @return the commrate
     */
    public double getCommrate() {
        return commrate;
    }

    /**
     * @param commrate the commrate to set
     */
    public void setCommrate(double commrate) {
        this.commrate = commrate;
    }
    
    // A method named earning which calculates the earning of the employee
    public double earning()
    {
        return grosssales * commrate;
    }
    
    // A method named toString which displays the output
    public String toString()
    {
        return "Employee First Name: "+firstname+"\n\n"+"Employee Last Name: "+lastname+"\n\n"+"Employee SIN Number: "+ssn+"\n\n"+"Employee Gross Sales: "+grosssales+"\n\n"+"Employee Commission Rate: "+commrate+"\n\n";
    }
    
    
}
