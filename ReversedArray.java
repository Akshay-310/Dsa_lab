package myhelloworld;

public class ReversedArray {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed array:");
        printArray(numbers);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move towards the middle
            start++;
            end--;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
