package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;

/*
 * Program to take a number as input
 * and find all its factors using a for loop.
 */
public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}