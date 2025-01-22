package myhelloworld;

public class OneDarrayOperations {
    public static void main(String[] args) {
        
        // Declaration and Initialization
        int[] numbers = {13, 21, 45, 76, 50};
        System.out.println("Initial array:");
        printArray(numbers);

        // Adding an element (60)
        numbers = addElement(numbers, 24);
        System.out.println("After adding the number 24:");
        printArray(numbers);

        // Editing an element by changing index no 3 element
        numbers[3] = 47;
        System.out.println("After editing index 3 to 47:");
        printArray(numbers);

        // Deleting an element of index no 1
        numbers = deleteElement(numbers, 1);
        System.out.println("After deleting index 1:");
        printArray(numbers);
    }

    // Function to add an element
    public static int[] addElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    // Function to delete an element
    public static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

    // Helper function to print array elements
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
    }
}
