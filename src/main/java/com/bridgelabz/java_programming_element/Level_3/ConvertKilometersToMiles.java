package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;

/*
 * Program to take distance in kilometers as input
 * and convert it into miles.
 * Formula: Miles = Kilometers * 0.621371.
 */
public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers:");
        double kilometers = input.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("The distance in miles is " + miles);

        input.close();
    }
}