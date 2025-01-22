package myhelloworld;
import java.util.Scanner;

public class FloatNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // take input of two floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = sc.nextDouble();

        // Close the scanner
        sc.close();

        // Truncate both numbers to three decimal places
        num1 = (int) (num1 * 1000) / 1000.0;
        num2 = (int) (num2 * 1000) / 1000.0;

        // Check if numbers are equal
        if (num1 == num2) 
        {
            System.out.println("Yes both numbers are same up to three decimal places.");
        } else 
        {
            System.out.println("The numbers are different.");
        }
    }
}

