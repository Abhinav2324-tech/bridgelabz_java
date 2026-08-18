package com.bridgelabz.java_control_flows.Level_3;
/*
 * This program counts the number of digits in an integer.
 * It takes an integer as input from the user.
 * It removes one digit at a time and increases the count.
 * Finally, it displays the total number of digits in the integer.
 */

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

        input.close();
    }
}