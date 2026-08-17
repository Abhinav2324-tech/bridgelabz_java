package com.bridgelabz.java_control_flows.Level_2;

import java.util.Scanner;

/*
 * Program to take a year as input and check whether
 * it is a Leap Year or not.
 * The program works for years greater than or equal to 1582.
 */
public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = input.nextInt();

        if (year >= 1582) {

            // Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

            // Using one if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Using logical operators: Leap Year");
            } else {
                System.out.println("Using logical operators: Not a Leap Year");
            }

        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        input.close();
    }
}