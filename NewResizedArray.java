package myhelloworld;

public class NewResizedArray {
    public static void main(String[] args) {
        // Initialize an array with a size of 3
        int[] arr = {6, 2, 3};
        
        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Resize the array (new size is 5)
        arr = resizeArray(arr, 5);
        
        // Print resized array
        System.out.println("\nResized Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to resize the array
    public static int[] resizeArray(int[] originalArray, int newSize) {
        // Create a new array with the new size
        int[] newArray = new int[newSize];
        
        // Copy the elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        
        // Return the resized array
        return newArray;
    }
}

