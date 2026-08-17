package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to take a natural number as input
 * and print whether each number from 1 to the
 * entered number is odd or even using a for loop.
 */
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }

        } else {
            System.out.println("Please enter a natural number.");
        }

        input.close();
    }
}