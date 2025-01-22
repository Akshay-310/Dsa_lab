package myhelloworld;
import java.util.Scanner;

public class CheckOrder {
    // Method to check the order of the numbers
    public static void checkNumOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) 
        {
            System.out.println("increasing order");
        } 
        else if (num1 > num2 && num2 > num3) 
        {
            System.out.println("decreasing order");
        } 
        else 
        {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // Taking input of three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Close the scanner
        sc.close();

        // Calling the checkNumOrder method
        checkNumOrder(num1, num2, num3);
    }
}

