package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;
/*
 * Program to take temperature in Celsius as input
 * and convert it into Fahrenheit.
 * Formula: Fahrenheit = (Celsius * 9/5) + 32.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Temperature in Fahrenheit is " + fahrenheit);

        input.close();
    }
}