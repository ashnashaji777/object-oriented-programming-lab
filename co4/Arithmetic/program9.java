package Arithmetic;


import java.util.Arrays;

public class program9 {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements at index j and j+1
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {5, 2, 10, 8, 3};
        System.out.println("Before sorting: " + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("After sorting: " + Arrays.toString(intArray));

        // Example usage with String array
        String[] stringArray = {"banana", "apple", "cherry", "date"};
        System.out.println("Before sorting: " + Arrays.toString(stringArray));
        bubbleSort(stringArray);
        System.out.println("After sorting: " + Arrays.toString(stringArray));
    }
}
