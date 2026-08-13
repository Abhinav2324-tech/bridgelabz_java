package com.bridgelabz.java_programming_element.Level_3;

import java.util.Scanner;

/*
 * Program to calculate the perimeter of a rectangle
 * by taking length and width as input.
 * Formula: Perimeter = 2 * (length + width).
 */
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");
        double length = input.nextDouble();

        System.out.println("Enter the width:");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is " + perimeter);

        input.close();
    }
}