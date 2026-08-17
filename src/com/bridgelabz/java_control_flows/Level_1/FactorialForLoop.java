package com.bridgelabz.java_control_flows.Level_1;

import java.util.Scanner;

/*
 * Program to take a positive integer as input
 * and calculate its factorial using a for loop.
 */
public class FactorialForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}