/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Quiz 1: RestaurntBill.java 
 */
package restaurantbill;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Defines Scanner Class
        Scanner sc = new Scanner(System.in);
        
        // Asks the user to enter the cost of their purchase and stores it in the cost_of_meal variable
        System.out.print("Enter cost of purchase: ");
        double cost_of_meal = sc.nextDouble();
        
        // Declares the Variables
        double GST;
        double PST;
        double TotalCost;
        
        // Computes the GST, PST and the total cost
        GST = cost_of_meal * 0.07;
        PST = cost_of_meal * 0.08;
        TotalCost = cost_of_meal + GST + PST;
        
        System.out.println();
        System.out.println("Thank you for patronizing our store");
        System.out.println("*************************************");
        System.out.println();
        
        // Prints the output to the console
        System.out.println("Cost of meal - \t\t$ "+cost_of_meal);
        System.out.printf("GST (7%%)     - \t\t$  %.2f\n", GST);
        System.out.printf("GST (8%%)     - \t\t$  %.2f\n", PST);
        System.out.println();
        System.out.printf("Total Cost \t\t$ %.2f\n",TotalCost);
        System.out.println();
        System.out.println("Please visit us again soon");
        System.out.println("****************************");
        
    }
    
}
