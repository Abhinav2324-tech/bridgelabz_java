package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to take a number as input
 * and print its multiplication table
 * from 6 to 9 using a for loop.
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}