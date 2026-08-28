package com.bridgelabz.java_keywords.Level_1;
/*
This program creates a Student class to demonstrate static, this,
final, and instanceof. The universityName and totalStudents are shared
among all students, rollNumber cannot be changed once assigned,
and instanceof checks whether an object belongs to the Student class.
*/

import java.util.Scanner;

public class Student {

    private String name;
    private final int rollNumber;
    private String grade;

    private static String universityName = "SRM University";
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = input.nextLine();

        System.out.println("Enter roll number:");
        int rollNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter grade:");
        String grade = input.nextLine();

        Student student = new Student(name, rollNumber, grade);

        if (student instanceof Student) {
            student.displayDetails();

            System.out.println("Enter new grade:");
            String newGrade = input.nextLine();

            student.updateGrade(newGrade);

            System.out.println("After updating grade:");
            student.displayDetails();
        }

        Student.displayTotalStudents();

        input.close();
    }
}