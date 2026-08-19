package com.bridgelabz.java_methods.Level_3;
/*
 * This program creates a NumberChecker utility class using static methods.
 * It stores the digits of a number, reverses the digits, and compares two arrays.
 * It checks whether the number is a Palindrome and whether it is a Duck Number.
 * Finally, it displays the digits and results of all the checks.
 */

import java.util.Scanner;

public class NumberChecker4 {

    public static int countDigits(int number) {

        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    public static int[] reverseDigits(int[] digits) {

        int[] reverse = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {

        int[] reverse = reverseDigits(digits);

        return compareArrays(digits, reverse);
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number);

        int[] reverse = reverseDigits(digits);

        boolean palindrome = isPalindrome(digits);

        boolean duck = isDuckNumber(digits);

        System.out.println("Number of digits = " + count);

        System.out.print("Digits = ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        System.out.print("Reversed digits = ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }

        System.out.println();

        System.out.println("Palindrome Number = " + palindrome);
        System.out.println("Duck Number = " + duck);

        input.close();
    }
}