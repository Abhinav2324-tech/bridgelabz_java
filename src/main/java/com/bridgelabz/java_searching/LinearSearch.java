package com.bridgelabz.java_searching;

public class LinearSearch {

    public int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        LinearSearch obj = new LinearSearch();

        int[] arr = {10, 30, 50, 20, 40};

        int target = 20;

        int result = obj.search(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}