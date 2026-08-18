package com.bridgelabz.java_control_flows.Level_3;

/*
 * This program checks whether a given number is an Armstrong number or not.
 * It takes an integer as input and finds the sum of the cubes of its digits.
 * It compares the calculated sum with the original number.
 * Finally, it displays whether the number is an Armstrong number or not.
 */

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {

            int remainder = originalNumber % 10;

            sum = sum + (remainder * remainder * remainder);

            originalNumber = originalNumber / 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }

        input.close();
    }
}