package myhelloworld;

import java.util.Scanner;

public class FindPalindrome {
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();
        
        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String testString = scanner.nextLine();
        
        // Check if the input string is a palindrome
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
        
        // Close the scanner object
        scanner.close();
    }
}
