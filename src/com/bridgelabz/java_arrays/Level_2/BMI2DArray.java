package com.bridgelabz.java_arrays.Level_2;
/*
 * This program calculates the BMI of multiple persons using a 2D array.
 * It stores the weight, height, and BMI of each person in the 2D array.
 * It checks that the entered weight and height are positive values.
 * Finally, it displays the height, weight, BMI, and weight status of each person.
 */

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter weight of person " + (i + 1) + " in kg:");
            personData[i][0] = input.nextDouble();

            if (personData[i][0] <= 0) {
                System.out.println("Enter a positive weight.");
                i--;
                continue;
            }

            System.out.println("Enter height of person " + (i + 1) + " in cm:");
            personData[i][1] = input.nextDouble();

            if (personData[i][1] <= 0) {
                System.out.println("Enter positive values again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < number; i++) {

            double heightInMeter = personData[i][1] / 100;

            personData[i][2] = personData[i][0] /
                    (heightInMeter * heightInMeter);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " cm");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
        }

        input.close();
    }
}