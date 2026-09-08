package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;

/*
 * Program to take three numbers as input
 * and calculate their average.
 * Formula: Average = (number1 + number2 + number3) / 3.
 */
public class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = input.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = input.nextDouble();

        System.out.println("Enter the third number:");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("The average is " + average);

        input.close();
    }
}