package com.bridgelabz.java_control_flows.Level_2;

import java.util.Scanner;

/*
 * Program to take a year as input and determine
 * whether it is a Leap Year using a single if condition
 * with logical AND (&&) and OR (||) operators.
 */
public class LeapYearLogical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = input.nextInt();

        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("The Year is a Leap Year");
        } else {
            System.out.println("The Year is not a Leap Year");
        }

        input.close();
    }
}
