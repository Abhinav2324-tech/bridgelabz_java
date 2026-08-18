package com.bridgelabz.java_control_flows.Level_3;
/*
 * This program checks whether a given number is an Abundant Number.
 * It finds all the proper divisors of the entered number and calculates their sum.
 * It compares the sum of the divisors with the original number.
 * Finally, it displays whether the number is an Abundant Number or not.
 */

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        }
        else {
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}
