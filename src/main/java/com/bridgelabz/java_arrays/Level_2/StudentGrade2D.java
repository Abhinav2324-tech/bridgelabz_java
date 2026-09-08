package com.bridgelabz.java_arrays.Level_2;
/*
 * This program takes marks of students in Physics, Chemistry, and Maths
 * and stores them in a 2D array. It calculates the percentage of each student
 * and assigns a grade based on the percentage. Finally, it displays the marks,
 * percentage, and grade of each student.
 */

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int number = input.nextInt();

        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter Physics marks of student " + (i + 1) + ":");
            marks[i][0] = input.nextInt();

            System.out.println("Enter Chemistry marks:");
            marks[i][1] = input.nextInt();

            System.out.println("Enter Maths marks:");
            marks[i][2] = input.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Enter positive values again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i] + "%");
            System.out.println("Grade = " + grade[i]);
        }

        input.close();
    }
}