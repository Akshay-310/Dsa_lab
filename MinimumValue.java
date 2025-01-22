package myhelloworld;

public class MinimumValue {

    // Method to find the minimum value in an array
    public static int findMinimumNum(int[] array) {
        int min = array[0]; // Assume the first element is the minimum
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if a smaller value is found
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) 
    {
        int[] numbers = {80, 20, 7, 32, 6};
        int minValue = findMinimumNum(numbers);
        System.out.println("Minimum value in the array: " + minValue);
    } 
}
