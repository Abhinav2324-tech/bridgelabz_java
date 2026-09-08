package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to take numbers as input and find their sum
 * until the user enters 0 or a negative number.
 * Uses an infinite while loop and break statement.
 */
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.println("Enter a number:");
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            total = total + number;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}