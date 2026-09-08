package com.bridgelabz.java_control_flows.Level_1;

import java.util.Scanner;

/*
 * Program to take numbers as input from the user
 * and calculate their sum until the user enters 0.
 * The loop terminates when 0 is entered.
 */
public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Enter a number:");
        double number = input.nextDouble();

        while (number != 0) {
            total = total + number;

            System.out.println("Enter a number:");
            number = input.nextDouble();
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}