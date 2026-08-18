package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program calculates various trigonometric functions for a given angle.
 * It takes the angle in degrees as input and converts it into radians.
 * It creates an object and calls a method to calculate sine, cosine, and tangent.
 * Finally, it displays the calculated trigonometric values.
 */
public class TrigonometricFunctions {

    public double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        double[] result = {sine, cosine, tangent};

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double angle = input.nextDouble();

        TrigonometricFunctions obj = new TrigonometricFunctions();

        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);

        input.close();
    }
}
