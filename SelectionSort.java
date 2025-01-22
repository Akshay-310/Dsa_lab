public class SelectionSort {
    public static void selectionSort(int[] array)
    {
        int n = array.length;

        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {88, 55, 23, 76, 100, 99};

        // Print the array before sorting
        System.out.println("Before sorting: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calling the method
        selectionSort(array);

        // Print the sorted array
        System.out.println("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

