public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(array, left, mid);

            // Recursively sort the right half
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;         // Size of the left subarray
        int n2 = right - mid;           // Size of the right subarray

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[mid + 1 + j];

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {22, 58, 47, 96, 45, 32, 12};

        // Array before sorting
        System.out.println("Before sorting: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // calling method mergeSort
        mergeSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
