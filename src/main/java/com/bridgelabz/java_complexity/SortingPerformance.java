package com.bridgelabz.java_complexity;
import java.util.Arrays;
import java.util.Random;

public class SortingPerformance {

    /*
     * Bubble Sort:
     * Repeatedly compares adjacent elements and swaps them
     * if they are in the wrong order.
     *
     * Time Complexity:
     * Average/Worst Case: O(N^2)
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Perform multiple passes through the array
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap the two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }


    /*
     * Merge Sort:
     * Divides the array into smaller halves,
     * sorts them recursively, and merges them.
     *
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */
    public static void mergeSort(int[] arr, int left, int right) {

        // Continue dividing until only one element remains
        if (left < right) {

            int mid = left + (right - left) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }


    /*
     * This method combines two individually sorted
     * portions of the array into one sorted portion.
     */
    public static void merge(int[] arr, int left, int mid, int right) {

        int size1 = mid - left + 1;
        int size2 = right - mid;

        // Temporary arrays for the two halves
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        // Copy elements into left temporary array
        for (int i = 0; i < size1; i++) {
            leftArray[i] = arr[left + i];
        }

        // Copy elements into right temporary array
        for (int j = 0; j < size2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        /*
         * Compare elements from both temporary arrays
         * and place the smaller one into the original array.
         */
        while (i < size1 && j < size2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from the left array
        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right array
        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


    /*
     * Quick Sort:
     * Selects a pivot and partitions the array so that
     * smaller elements are on the left and larger elements
     * are on the right.
     *
     * Average Time Complexity: O(N log N)
     * Worst Time Complexity: O(N^2)
     */
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition the array and get pivot position
            int pivotIndex = partition(arr, low, high);

            // Sort elements before the pivot
            quickSort(arr, low, pivotIndex - 1);

            // Sort elements after the pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    /*
     * Partition rearranges the elements around a pivot.
     * Elements smaller than the pivot move to the left.
     */
    public static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Move smaller elements to the left side
            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    /*
     * This method creates a dataset and compares
     * the execution time of all three sorting algorithms.
     */
    public static void compareSorting(int size) {

        int[] data = new int[size];
        Random random = new Random();

        // Generate random values
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(1_000_000);
        }

        /*
         * Create separate copies so every algorithm
         * receives exactly the same unsorted data.
         */
        int[] bubbleData = Arrays.copyOf(data, data.length);
        int[] mergeData = Arrays.copyOf(data, data.length);
        int[] quickData = Arrays.copyOf(data, data.length);

        System.out.println("\nDataset Size: " + size);

        /*
         * Bubble Sort becomes extremely slow for very
         * large datasets, so avoid running it for 1,000,000.
         */
        if (size <= 10_000) {

            long start = System.nanoTime();

            bubbleSort(bubbleData);

            long end = System.nanoTime();

            // Convert nanoseconds into milliseconds
            double bubbleTime = (end - start) / 1_000_000.0;

            System.out.println("Bubble Sort: " + bubbleTime + " ms");

        } else {

            // Bubble Sort is impractical for this dataset size
            System.out.println("Bubble Sort: Skipped - too inefficient");
        }


        /*
         * Measure Merge Sort execution time.
         */
        long mergeStart = System.nanoTime();

        mergeSort(mergeData, 0, mergeData.length - 1);

        long mergeEnd = System.nanoTime();

        double mergeTime = (mergeEnd - mergeStart) / 1_000_000.0;

        System.out.println("Merge Sort: " + mergeTime + " ms");


        /*
         * Measure Quick Sort execution time.
         */
        long quickStart = System.nanoTime();

        quickSort(quickData, 0, quickData.length - 1);

        long quickEnd = System.nanoTime();

        double quickTime = (quickEnd - quickStart) / 1_000_000.0;

        System.out.println("Quick Sort: " + quickTime + " ms");
    }


    public static void main(String[] args) {

        /*
         * Test the sorting algorithms using
         * datasets of different sizes.
         */
        compareSorting(1_000);
        compareSorting(10_000);
        compareSorting(1_000_000);
    }
}
