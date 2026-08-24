package com.bridgelabz.java_constructors.Level_1;
/*
This program creates a Circle class with radius as an attribute.
It uses constructor chaining to initialize the radius using
a default value and a user-provided value.
*/

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle circle1 = new Circle();

        System.out.println("Default Circle:");
        circle1.displayDetails();

        System.out.println("Enter radius:");
        double radius = input.nextDouble();

        Circle circle2 = new Circle(radius);

        System.out.println("User Provided Circle:");
        circle2.displayDetails();

        input.close();
    }
}