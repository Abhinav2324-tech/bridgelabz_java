package com.bridgelabz.java_strings.Level_1;
/*
 * This program demonstrates a NullPointerException using a null String.
 * It first generates the exception by accessing a String method on a null value.
 * It then handles the NullPointerException using a try-catch block.
 * Finally, it displays an appropriate message when the exception occurs.
 */

public class NullPointerExceptionDemo {

    public static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        try {
            generateException();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException generated.");
        }

        handleException();
    }
}