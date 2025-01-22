package myhelloworld;

import java.util.Scanner;

public class SortedArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a sorted array
        int[] arr = {2, 5, 8, 12, 16};
        int size = arr.length;

        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Search");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

        switch (choice) 
        {
            // For searching the element
            case 1:
            System.out.print("Enter the element to search: ");
            int searchElement = scanner.nextInt();
            int searchResult = search(arr, size, searchElement);
            if (searchResult != -1) {
            System.out.println("Element found at index: " + searchResult);
            } else 
            {
                System.out.println("Element not found.");
            }
                break;
                
            // For inserting the element
            case 2:
            System.out.print("Enter the element to insert: ");
            int insertElement = scanner.nextInt();
            arr = insert(arr, size, insertElement);
            size++;           // Increase the size of the array after insertion
            System.out.print("Array after insertion: ");
            printArray(arr, size);
            break;

            //For deleting the element
            case 3:
            System.out.print("Enter the element to delete: ");
            int deleteElement = scanner.nextInt();
            arr = delete(arr, size, deleteElement);
            size--;           // Decrease the size of the array after deletion
            System.out.print("Array after deletion: ");
            printArray(arr, size);
            break;

            // Exit
            case 4:
               System.out.println("Exiting the program.");
               scanner.close();
               return;

            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to search in sorted array
    public static int search(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if element is not found
    }

    // Method to Insert into sorted array
    public static int[] insert(int[] arr, int size, int element) {
        int[] newArr = new int[size + 1];
        int i = 0;

        // Copy elements smaller than the new element
        while (i < size && arr[i] < element) {
            newArr[i] = arr[i];
            i++;
        }

        // Insert the new element
        newArr[i] = element;

        // Copy the rest of the elements
        while (i < size) {
            newArr[i + 1] = arr[i];
            i++;
        }

        return newArr;
    }

    // Method to Delete from sorted array
    public static int[] delete(int[] arr, int size, int element) {
        int index = search(arr, size, element);
        if (index == -1) {
            System.out.println("Element not found.");
            return arr; // Return original array if not found
        }

        int[] newArr = new int[size - 1];
        int i = 0;

    // Copy elements before the target
    while (i < index) 
    {
        newArr[i] = arr[i];
        i++;
    }

    // Skip the target and copy the rest
    while (i < size - 1) 
    {
            newArr[i] = arr[i + 1];
            i++;
    }

        return newArr;
    }

    // Print array
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

