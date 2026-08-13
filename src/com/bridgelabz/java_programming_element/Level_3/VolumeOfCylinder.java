package com.bridgelabz.java_programming_element.Level_3;
import java.util.Scanner;

/*
 * Program to calculate the volume of a cylinder
 * by taking radius and height as input.
 * Formula: Volume = PI * radius * radius * height.
 */
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        System.out.println("Enter the height:");
        double height = input.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("The volume of the cylinder is " + volume);

        input.close();
    }
}
