/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Quiz 3: Quiz3.java 
 */
package quiz3;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Declare and initialize max and count variables
       int max = 0;
       int count = 0;
       // Declares integer as type int
       int integer;
       
       // Asks the user for integer input
       System.out.println("Enter an integer-input, ends if you enter 0: ");
       
       // Using do-while loop to find the largest bumber and the occurrence of the largest number user-input integers
      
       do
       {
           integer = input.nextInt(); // stores the input
           // max stores the current max number
           // count stores it's occurrence
           if (integer > max) // if interger is greater than max, assign it to max and reset the count to 1
           {
               count = 0;
               max = integer;               
           }
           if (integer == max) // if integer is equal to max, increment the count by 1
           {
               count++;
           }
       }
       while (integer !=0);  // While the integer is not equal to zero, the program will run and if the user input zero as the input, the program will end and display the output
       
       // Displays the output
       System.out.println("The largest number is "+max);
       System.out.println("The occurrence count of the largest number is "+count);
        
    }
    
}
