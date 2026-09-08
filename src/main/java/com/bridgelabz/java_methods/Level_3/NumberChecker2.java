package com.bridgelabz.java_methods.Level_3;

/*
 * This program creates a NumberChecker utility class using static methods.
 * It stores the digits of a number in an array and calculates their sum and sum of squares.
 * It checks whether the given number is a Harshad number.
 * Finally, it finds and displays the frequency of each digit using a 2D array.
 */

import java.util.Scanner;

public class NumberChecker2 {

    public static int countDigits(int number) {

        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp = temp / 10;
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

    public static int findSum(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }

        return sum;
    }

    public static double findSumOfSquares(int[] digits) {

        double sumOfSquares = 0;

        for (int i = 0; i < digits.length; i++) {
            sumOfSquares = sumOfSquares + Math.pow(digits[i], 2);
        }

        return sumOfSquares;
    }

    public static boolean isHarshad(int number, int[] digits) {

        int sum = findSum(digits);

        return number % sum == 0;
    }

    public static int[][] findFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number);

        int sum = findSum(digits);

        double sumOfSquares = findSumOfSquares(digits);

        boolean harshad = isHarshad(number, digits);

        int[][] frequency = findFrequency(digits);

        System.out.println("Number of digits = " + count);

        System.out.print("Digits = ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        System.out.println("Sum of digits = " + sum);

        System.out.println("Sum of squares of digits = " + sumOfSquares);

        System.out.println("Harshad Number = " + harshad);

        System.out.println("Digit\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

        input.close();
    }
}