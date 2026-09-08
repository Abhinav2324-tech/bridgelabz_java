package com.bridgelabz.java_strings.Level_2;
/*
 * This program removes the leading and trailing spaces from a given string
 * using the charAt() method and creates the trimmed text using a substring method.
 * It also trims the text using the built-in trim() method.
 * Finally, it compares both results and displays whether they are equal.
 */

import java.util.Scanner;

public class TrimString {

    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
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

        int[] indexes = findTrimIndexes(text);

        String result1 = createSubstring(text, indexes[0], indexes[1]);

        String result2 = text.trim();

        boolean result = compareStrings(result1, result2);

        System.out.println("Using user-defined method = " + result1);
        System.out.println("Using trim() method = " + result2);
        System.out.println("Both results are equal = " + result);

        input.close();
    }
}