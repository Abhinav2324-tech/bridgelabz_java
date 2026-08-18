package com.bridgelabz.java_control_flows.Level_3;
/*
 * This program creates a simple calculator using a switch-case statement.
 * It takes two numbers and an operator as input from the user.
 * It performs addition, subtraction, multiplication, or division based on the operator.
 * Finally, it displays the result or an error message for an invalid operator.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double first = input.nextDouble();

        System.out.println("Enter second number:");
        double second = input.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        String op = input.next();

        switch (op) {

            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                }
                else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}