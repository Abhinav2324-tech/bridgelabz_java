package com.bridgelabz.java_strings.Level_1;
/*
 * This program compares two strings using the charAt() method.
 * It also compares the same strings using the built-in equals() method.
 * Finally, it checks and displays whether both comparison results are the same.
 */

import java.util.Scanner;

public class StringComparison {

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

        System.out.println("Enter first string:");
        String str1 = input.next();

        System.out.println("Enter second string:");
        String str2 = input.next();

        boolean charAtResult = compareStrings(str1, str2);

        boolean equalsResult = str1.equals(str2);

        System.out.println("Result using charAt() = " + charAtResult);
        System.out.println("Result using equals() = " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both comparison results are the same.");
        }
        else {
            System.out.println("Both comparison results are different.");
        }

        input.close();
    }
}