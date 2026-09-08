package com.bridgelabz.java_methods.Level_3;
/*
 * This program creates a NumberChecker utility class using static methods.
 * It checks whether a number is Prime, Neon, Spy, Automorphic, or Buzz.
 * Each property is checked using a separate method.
 * Finally, it displays the result of all the checks for the entered number.
 */

import java.util.Scanner;

public class NumberChecker3 {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        return sum == number;
    }

    public static boolean isSpy(int number) {

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;

            sum = sum + digit;
            product = product * digit;

            temp = temp / 10;
        }

        return sum == product;
    }

    public static boolean isAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp != 0) {

            if (temp % 10 != square % 10) {
                return false;
            }

            temp = temp / 10;
            square = square / 10;
        }

        return true;
    }

    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Prime Number = " + isPrime(number));
        System.out.println("Neon Number = " + isNeon(number));
        System.out.println("Spy Number = " + isSpy(number));
        System.out.println("Automorphic Number = " + isAutomorphic(number));
        System.out.println("Buzz Number = " + isBuzz(number));

        input.close();
    }
}