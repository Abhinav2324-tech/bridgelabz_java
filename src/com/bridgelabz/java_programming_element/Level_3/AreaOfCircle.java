package com.bridgelabz.java_programming_element.Level_3;
import java.util.Scanner;
/*
 * Program to take the radius of a circle as input
 * and calculate its area.
 * Formula: Area = PI * radius * radius.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is " + area);

        input.close();
    }
}
