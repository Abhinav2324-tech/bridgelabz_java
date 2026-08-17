package com.bridgelabz.java_arrays.Level_2;
/*
 * This program takes marks of students in Physics, Chemistry, and Maths.
 * It calculates the percentage of each student and assigns a grade based on the percentage.
 * If any entered mark is negative, it asks the user to enter the marks again.
 * Finally, it displays the marks, percentage, and grade of each student.
 */

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int number = input.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];

        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter Physics marks of student " + (i + 1) + ":");
            physics[i] = input.nextInt();

            System.out.println("Enter Chemistry marks:");
            chemistry[i] = input.nextInt();

            System.out.println("Enter Maths marks:");
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter positive values again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            }
            else if (percentage[i] >= 70) {
                grade[i] = "B";
            }
            else if (percentage[i] >= 60) {
                grade[i] = "C";
            }
            else if (percentage[i] >= 50) {
                grade[i] = "D";
            }
            else if (percentage[i] >= 40) {
                grade[i] = "E";
            }
            else {
                grade[i] = "R";
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Student " + (i + 1));
            System.out.println("Physics = " + physics[i]);
            System.out.println("Chemistry = " + chemistry[i]);
            System.out.println("Maths = " + maths[i]);
            System.out.println("Percentage = " + percentage[i] + "%");
            System.out.println("Grade = " + grade[i]);
        }

        input.close();
    }
}