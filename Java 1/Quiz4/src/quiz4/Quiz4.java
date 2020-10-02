/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Quiz 4: Quiz4.java 
 */
package quiz4;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        
        // Asks user to enter any integer and stores it in variable called num of type int
        System.out.print("Please enter any Integer: ");
        int num = input.nextInt();
        
        System.out.println("The sum of the digits is: "+sumDigits(num));
    }
    
    // A method which it calculates the sum of each digit giver by the user
    public static int sumDigits(int n) {
        
        int sum;
      
        for(sum = 0; n!=0; n/=10)
        {
            sum += n % 10;
        }
        
        return sum;
        
    }
    
    
}
