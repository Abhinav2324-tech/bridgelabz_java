package com.bridgelabz.java_arrays.Level_2;
/*
 * This program calculates the Body Mass Index (BMI) of multiple persons.
 * It takes the weight and height of each person as input and stores them in arrays.
 * It calculates the BMI and determines whether the person is Underweight, Normal,
 * Overweight, or Obese. Finally, it displays the height, weight, BMI, and status.
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter weight of person " + (i + 1) + " in kg:");
            weight[i] = input.nextDouble();

            System.out.println("Enter height of person " + (i + 1) + " in cm:");
            height[i] = input.nextDouble();
        }

        for (int i = 0; i < number; i++) {

            double heightInMeter = height[i] / 100;

            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Height = " + height[i] + " cm");
            System.out.println("Weight = " + weight[i] + " kg");
            System.out.println("BMI = " + bmi[i]);
            System.out.println("Status = " + status[i]);
        }

        input.close();
    }
}