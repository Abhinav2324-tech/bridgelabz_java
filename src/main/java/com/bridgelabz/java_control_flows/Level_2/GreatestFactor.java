package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;

/*
 * Program to take a number as input and find
 * its greatest factor other than the number itself
 * using a for loop.
 */
public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + number +
                " besides itself is " + greatestFactor);

        input.close();
    }
}
