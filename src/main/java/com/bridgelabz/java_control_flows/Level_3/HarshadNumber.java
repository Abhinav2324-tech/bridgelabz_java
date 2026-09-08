package com.bridgelabz.java_control_flows.Level_3;
/*
 * This program checks whether a given number is a Harshad Number.
 * It calculates the sum of all the digits of the entered number.
 * It checks whether the original number is divisible by the sum of its digits.
 * Finally, it displays whether the number is a Harshad Number or not.
 */

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        }
        else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        input.close();
    }
}