package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;

/*
 * Program to take a base and exponent as input
 * and calculate the base raised to the exponent
 * without using loops or conditionals.
 */
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        double base = input.nextDouble();

        System.out.println("Enter the exponent:");
        double exponent = input.nextDouble();

        double result = Math.pow(base, exponent);//Formula for power

        System.out.println("The result is " + result);

        input.close();
    }
}