package com.bridgelabz.java_strings.Level_1;
/*
 * This program creates a substring from a given string using the charAt() method.
 * It also creates the substring using the built-in substring() method.
 * It compares both substrings using a separate method.
 * Finally, it displays the substrings and whether both results are equal.
 */

import java.util.Scanner;

public class SubstringComparison {

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

        System.out.println("Enter a string:");
        String text = input.next();

        System.out.println("Enter start index:");
        int start = input.nextInt();

        System.out.println("Enter end index:");
        int end = input.nextInt();

        String substring1 = createSubstring(text, start, end);

        String substring2 = text.substring(start, end);

        boolean result = compareStrings(substring1, substring2);

        System.out.println("Substring using charAt() = " + substring1);
        System.out.println("Substring using substring() = " + substring2);
        System.out.println("Both substrings are equal = " + result);

        input.close();
    }
}