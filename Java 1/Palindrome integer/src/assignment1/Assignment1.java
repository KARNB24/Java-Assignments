/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Assignment 1: Assignment1.java 
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        
        // Asks user to enter any integer and stores it in variable called num of type int
        System.out.print("Enter any integer: ");
        int num = input.nextInt();
        
        int reversenumber = reverse(num); // calls out the method and stores it in a variable
        System.out.println("The reverse number is: "+reversenumber);
        // If reversenumber is equal to num then it's a palindrome number else it's not
        if (reversenumber == num)
        {
            System.out.println("The number is an Palindrome number");
        }
        else
        {
            System.out.println("The number is not a Palindrome number");
        }
        
        
    }
    // A method named reverse which reverses any number entered by the user
    public static int reverse(int number)
    {
        int reversenum = 0;
        
        
        for ( ; number !=0; )
        {
            reversenum = (reversenum * 10) + number%10;
            number = number / 10;            
        }
        return reversenum;
    }
    
}
