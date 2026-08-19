package com.bridgelabz.java_strings.Level_3;
/*
 * This program checks whether a given text is a palindrome using three different methods.
 * It checks by comparing characters from both ends, using recursion, and using character arrays.
 * Each method verifies whether the text reads the same forward and backward.
 * Finally, it displays the palindrome result obtained using all three methods.
 */

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {

        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    public static boolean checkPalindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        boolean result1 = checkPalindrome(text);

        boolean result2 = checkPalindromeRecursive(text, 0, text.length() - 1);

        boolean result3 = checkPalindromeArray(text);

        System.out.println("Palindrome using Logic 1 = " + result1);
        System.out.println("Palindrome using Logic 2 = " + result2);
        System.out.println("Palindrome using Logic 3 = " + result3);

        input.close();
    }
}
