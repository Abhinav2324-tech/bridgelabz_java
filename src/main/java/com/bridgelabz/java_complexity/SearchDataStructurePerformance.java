package com.bridgelabz.java_complexity;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SearchDataStructurePerformance {

    /*
     * Array Search:
     * Searches each element one by one until the target is found.
     *
     * Time Complexity: O(N)
     */
    public static boolean arraySearch(int[] arr, int target) {

        // Traverse through every element in the array
        for (int value : arr) {

            // Check whether the current element matches the target
            if (value == target) {
                return true;
            }
        }

        // Target was not found
        return false;
    }

    /*
     * This method creates the dataset and compares
     * Array, HashSet, and TreeSet search performance.
     */
    public static void compareSearch(int size) {

        int[] array = new int[size];

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        /*
         * Generate data and store the same values
         * in Array, HashSet, and TreeSet.
         */
        for (int i = 0; i < size; i++) {

            int value = random.nextInt(size * 10);

            array[i] = value;

            // HashSet stores unique values using hashing
            hashSet.add(value);

            // TreeSet stores unique values in sorted order
            treeSet.add(value);
        }

        /*
         * Choose the last array element as the target.
         * This makes Linear Search close to its worst case.
         */
        int target = array[size - 1];


        /*
         * Measure Array search time.
         */
        long arrayStart = System.nanoTime();

        boolean arrayResult = arraySearch(array, target);

        long arrayEnd = System.nanoTime();


        /*
         * Measure HashSet search time.
         *
         * contains() uses hashing and provides
         * O(1) average lookup time.
         */
        long hashStart = System.nanoTime();

        boolean hashResult = hashSet.contains(target);

        long hashEnd = System.nanoTime();


        /*
         * Measure TreeSet search time.
         *
         * TreeSet internally uses a balanced Red-Black Tree,
         * giving O(log N) lookup time.
         */
        long treeStart = System.nanoTime();

        boolean treeResult = treeSet.contains(target);

        long treeEnd = System.nanoTime();


        // Calculate execution time in nanoseconds
        long arrayTime = arrayEnd - arrayStart;
        long hashTime = hashEnd - hashStart;
        long treeTime = treeEnd - treeStart;


        /*
         * Display the search results and execution times.
         */
        System.out.println("\nDataset Size: " + size);

        System.out.println("Target: " + target);

        System.out.println(
                "Array Search: " + arrayResult +
                        " | Time: " + arrayTime + " ns"
        );

        System.out.println(
                "HashSet Search: " + hashResult +
                        " | Time: " + hashTime + " ns"
        );

        System.out.println(
                "TreeSet Search: " + treeResult +
                        " | Time: " + treeTime + " ns"
        );
    }


    public static void main(String[] args) {

        /*
         * Compare the three data structures
         * using datasets of different sizes.
         */
        compareSearch(1_000);
        compareSearch(100_000);
        compareSearch(1_000_000);
    }
}