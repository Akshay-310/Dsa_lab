public class QuickSort {
    public static void quickSort(int[] array, int low, int high)
    {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(array, low, high);

            // Recursively sort the elements before and after the pivot
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Partition function to place the pivot in the correct position
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Select the last element as the pivot
        int i = low - 1;         // Index for smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (array[j] < pivot)
            {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at index (i + 1)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the pivot index
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        // print the array before sorting
        System.out.println("Array before sorting: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
