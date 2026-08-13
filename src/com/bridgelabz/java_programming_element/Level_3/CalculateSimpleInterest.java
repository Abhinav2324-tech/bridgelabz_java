package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;

/*
 * Program to calculate simple interest.
 * By taking principal, rate and time as input.
 * Formula: Simple Interest = (Principal * Rate * Time) / 100.
 */
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal:");
        double principal = input.nextDouble();

        System.out.println("Enter the rate:");
        double rate = input.nextDouble();

        System.out.println("Enter the time:");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest);

        input.close();
    }
}