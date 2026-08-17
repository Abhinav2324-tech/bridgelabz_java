package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to find the sum of n natural numbers using a for loop
 * and using the formula n * (n + 1) / 2.
 * It also compares both results to check if they are equal.
 */
public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using for loop is " + sum);
            System.out.println("Sum using formula is " + formulaSum);
            System.out.println("Both computations are correct: " + (sum == formulaSum));

        } else {
            System.out.println("The number is not a natural number.");
        }

        input.close();
    }
}