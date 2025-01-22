package myhelloworld;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements in the array (n - 1 elements)
        System.out.print("Enter the number of elements in the array (excluding the missing one): ");
        int n = scanner.nextInt();

        // The size of the array should be n - 1
        int[] arr = new int[n - 1]; // Array with n - 1 elements

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array (from 1 to " + n + " with one number missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the missing number
        int missingNumber = findMissingNumber(arr, n);

        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);

        // Close the scanner
        scanner.close();
    }

    // Method to find the missing number in the array
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }
}
