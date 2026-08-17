package com.bridgelabz.java_control_flows.Level_2;

import java.util.Scanner;

/*
 * Program to take marks of Physics, Chemistry and Maths as input,
 * calculate the average percentage and display the grade
 * and remarks based on the percentage obtained.
 */
public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Physics marks:");
        double physics = input.nextDouble();

        System.out.println("Enter Chemistry marks:");
        double chemistry = input.nextDouble();

        System.out.println("Enter Maths marks:");
        double maths = input.nextDouble();

        double percentage = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}