package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to find the sum of n natural numbers using a while loop
 * and using the formula n * (n + 1) / 2.
 * It also compares both results to check if they are equal.
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum = sum + i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop is " + sum);
            System.out.println("Sum using formula is " + formulaSum);

            System.out.println("Both computations are correct: " + (sum == formulaSum));

        } else {
            System.out.println("The number is not a natural number.");
        }

        input.close();
    }
}