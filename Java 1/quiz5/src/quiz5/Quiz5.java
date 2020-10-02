/*
Name: Karn Bhavsar (991578281)
Course: Object Oriented Programming - Java 1 (91222)
Program: Quiz 5: Quiz5.java 
 */
package quiz5;

import java.util.Scanner;

/**
 *
 * @author karnb
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Asks user to enter the size of list 1 and stores it in a variable
        System.out.print("Enter the size of list 1: ");
        int list1size = input.nextInt();
        // Declares an array list1
        int [] list1 = new int[list1size];
        // Asks the user to enter the values for list 1
        System.out.println("Enter value for list 1: ");
        // This prints the value less than the size of list 1
        for(int i=0; i<list1.length; i++)
        {
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter the size of list 2: ");
        int list2size = input.nextInt();
        
        int [] list2 = new int[list2size];
        System.out.println("Enter value for list 2: ");
        for(int i=0; i<list2.length; i++)
        {
            list2[i] = input.nextInt();
        }
        boolean check=true;
        for (int i=0; i<list1.length;i++)
        {
            // if the size of list 1 is equal to size of list 2 and values of list 1 is equal to values of list 2
            if (list1.length == list2.length && list1[i] == list2[i])
        {
        } else{
                check=false;
            }
        }
       if (check==false)
        {
            System.out.println("Two lists are not strictly identical");
        }
       else{
            System.out.println("Two lists are strictly identical");
       }
        
    }
    
  
}
