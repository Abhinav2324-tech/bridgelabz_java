package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;
/*
 * Program to take two numbers as input
 * and calculate and display their sum.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double number1 = input.nextDouble();

        System.out.println("Enter second number:");
        double number2 = input.nextDouble();

        double sum = number1 + number2;

        System.out.println("The sum is " + sum);

        input.close();
    }
}
