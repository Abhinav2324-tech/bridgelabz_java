package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;

/*
 * Program to take a number as input
 * and find all its multiples below 100
 * using a backward for loop.
 */
public class MultiplesBelow100 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        for (int i = 100; i >= 1; i--) {

            if (i % number == 0) {
                System.out.println(i);
                continue;
            }
        }

        input.close();
    }
}