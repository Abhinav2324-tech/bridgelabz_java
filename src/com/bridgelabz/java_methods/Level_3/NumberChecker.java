package com.bridgelabz.java_methods.Level_3;
/*
 * This program creates a NumberChecker utility class with static methods.
 * It finds the count of digits, stores digits in an array, checks for Duck
 * and Armstrong numbers, and finds the largest, second largest, smallest,
 * and second smallest digits. Finally, it displays all the results.
 */

import java.util.Scanner;

public class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {

        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], power);
        }

        return sum == number;
    }

    public static int[] findLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            }
            else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = countDigits(number);

        int[] digits = getDigits(number);

        boolean duck = isDuckNumber(digits);

        boolean armstrong = isArmstrong(number, digits);

        int[] largest = findLargest(digits);

        int[] smallest = findSmallest(digits);

        System.out.println("Count of digits = " + count);

        System.out.print("Digits = ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        System.out.println("Duck Number = " + duck);

        System.out.println("Armstrong Number = " + armstrong);

        System.out.println("Largest digit = " + largest[0]);

        System.out.println("Second largest digit = " + largest[1]);

        System.out.println("Smallest digit = " + smallest[0]);

        System.out.println("Second smallest digit = " + smallest[1]);

        input.close();
    }
}