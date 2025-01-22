
package myhelloworld;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array and get user input for the elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Move zeros to the end of the array
        moveZerosToEnd(arr);

        // Print the updated array
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to move zeros to the end of the array
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // If the element is non-zero, swap it with the element at nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                // Increment the nonZeroIndex
                nonZeroIndex++;
            }
        }
    }
}

