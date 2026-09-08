package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;

/*
 * Program to take a number and power as input
 * and calculate the number raised to the given power
 * using a for loop.
 */
public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the power:");
        int power = input.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);

        input.close();
    }
}