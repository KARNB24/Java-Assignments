/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Quiz 2: FruitStand.java 
 */
package fruitstand;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class FruitStand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Displays the user different choices of fruits to choice from
        System.out.println("Which fruit you would like to buy");
        System.out.println("A or a for apples");
        System.out.println("P or P for pears");
        System.out.println("G or g for grapes");
       
        // Asks the user to enter a choice as a character 
        System.out.print("Enter a choice: ");
        // Stores the characrter in variable choice
        char choice = input.next().charAt(0);
        
        // Using switch case to display the output as follows in each of the cases
        switch (choice) {
            // If the user enters A or a as the input, perform the following task
            case 'A':
            case 'a':
                {
                    double Price = 0.60; // Price for each apple
                    System.out.print("How many pounds of apples you want to buy: "); // asks the user for quantity
                    double quantity = input.nextDouble(); // stores it in a variable
                    double totalPrice = Price * quantity; // computes the total price
                    System.out.printf("Your total price will be: $%.2f\n",totalPrice); // Displays the total price to the user
                    System.out.println("Thanks for shopping come again!");
                    break; // ends the program
                }
            // // If the user enters P or p as the input, perform the following task
            case 'P':
            case 'p':
                {
                    double Price = 3.98/12; // Price for 12  pears
                    System.out.print("How many pears you want to buy: "); // asks the user for quantity
                    double quantity = input.nextDouble(); // stores it in a variable
                    double totalPrice = Price * quantity; // computes the total price
                    System.out.printf("Your total price will be: $%.2f\n",totalPrice); // Displays the total price to the user
                    System.out.println("Thanks for shopping come again!"); 
                    break; // ends the program
                }
            // If the user enters G or g as the input, perform the following task    
            case 'G':
            case 'g':
                {
                    double Price = 0.89; // price for each grapes
                    System.out.print("How many pounds of grapes you want to buy: "); // asks the user for quantity
                    double quantity = input.nextDouble(); // stores it in a variable
                    double totalPrice = Price * quantity; // computes the total price
                    System.out.printf("Your total price will be: $%.2f\n",totalPrice); // Displays the total price to the user
                    System.out.println("Thanks for shopping come again!");
                    break; // ends the program
                }
            // If the user enters a different character then the one above, it will come to the default case and displays Invalid choice to the user
            default:
                System.out.println("Invalid choice");
                break; // ends the program
        }
    }
    
}
