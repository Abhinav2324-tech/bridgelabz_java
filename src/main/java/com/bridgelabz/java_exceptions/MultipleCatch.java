package com.bridgelabz.java_exceptions;

public class MultipleCatch {

    public static int getValue(int[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index = 7;

        try {
            int value = getValue(arr, index);

            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
