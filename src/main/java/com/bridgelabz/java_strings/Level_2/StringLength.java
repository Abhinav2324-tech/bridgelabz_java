package com.bridgelabz.java_strings.Level_2;
/*
 * This program finds the length of a string without using the built-in length() method.
 * It uses an infinite loop and charAt() to access each character until an exception occurs.
 * It handles the exception and returns the number of characters in the string.
 * Finally, it compares the result with the built-in length() method.
 */

import java.util.Scanner;

public class StringLength {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.next();

        int result = findLength(text);

        System.out.println("Length using user-defined method = " + result);
        System.out.println("Length using length() method = " + text.length());

        input.close();
    }
}