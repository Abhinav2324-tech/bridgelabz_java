package com.bridgelabz.java_searching;
public class BinarySearch {

    public int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 60;

        int result = obj.search(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}