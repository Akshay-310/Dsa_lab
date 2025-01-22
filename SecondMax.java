package myhelloworld;

public class SecondMax {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 15};
        int secondMax = findSecondMax(numbers);
        System.out.println("Second maximum value in the array: " + secondMax);
    }

    // Method to find the second maximum element
    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements");
            return -1; // Return -1 or any indication of an error
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                // Update secondMax before changing max
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] < max) {
                // Update secondMax only if array[i] is less than max
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}

