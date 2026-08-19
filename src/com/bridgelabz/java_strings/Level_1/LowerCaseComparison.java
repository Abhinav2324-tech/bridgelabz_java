package com.bridgelabz.java_strings.Level_1;

/*
 * This program converts a complete text to lowercase using ASCII values.
 * It also converts the text using the built-in toLowerCase() method.
 * It compares both lowercase strings using a user-defined method.
 * Finally, it displays both results and whether they are equal.
 */

import java.util.Scanner;

public class LowerCaseComparison {

    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        String result1 = convertToLowerCase(text);

        String result2 = text.toLowerCase();

        boolean result = compareStrings(result1, result2);

        System.out.println("Using user-defined method = " + result1);
        System.out.println("Using toLowerCase() = " + result2);
        System.out.println("Both results are equal = " + result);

        input.close();
    }
}