package com.bridgelabz.java_complexity;
import java.util.Arrays;
import java.util.Random;

public class SearchPerformance {

    /*
     * Linear Search:
     * Checks every element one by one until the target is found.
     * Time Complexity: O(N)
     */
    public static int linearSearch(int[] arr, int target) {

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check whether the current element is the target
            if (arr[i] == target) {
                return i;
            }
        }

        // Target was not found
        return -1;
    }

    /*
     * Binary Search:
     * Repeatedly divides the search space into two halves.
     * The array must be sorted before performing Binary Search.
     * Time Complexity: O(log N)
     */
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        // Continue searching while a valid search range exists
        while (left <= right) {

            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // Search in the right half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // Search in the left half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }

    /*
     * This method compares Linear Search and Binary Search
     * for a particular dataset size.
     */
    public static void compareSearch(int size) {

        int[] data = new int[size];
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size * 10);
        }

        // Select the last element as the target
        int target = data[size - 1];

        /*
         * Measure Linear Search execution time.
         */
        long linearStart = System.nanoTime();

        int linearResult = linearSearch(data, target);

        long linearEnd = System.nanoTime();

        /*
         * Binary Search requires sorted data.
         * We create a copy so that the original array is not modified.
         */
        int[] sortedData = Arrays.copyOf(data, data.length);

        // Sorting takes O(N log N)
        Arrays.sort(sortedData);

        // Measure only the Binary Search operation
        long binaryStart = System.nanoTime();

        int binaryResult = binarySearch(sortedData, target);

        long binaryEnd = System.nanoTime();

        // Calculate execution times
        long linearTime = linearEnd - linearStart;
        long binaryTime = binaryEnd - binaryStart;

        /*
         * Display the comparison results.
         */
        System.out.println("\nDataset Size: " + size);

        System.out.println("Linear Search:");
        System.out.println("Index: " + linearResult);
        System.out.println("Time: " + linearTime + " ns");

        System.out.println("Binary Search:");
        System.out.println("Index: " + binaryResult);
        System.out.println("Time: " + binaryTime + " ns");
    }

    public static void main(String[] args) {

        /*
         * Compare search performance using
         * three different dataset sizes.
         */
        compareSearch(1_000);
        compareSearch(10_000);
        compareSearch(1_000_000);
    }
}