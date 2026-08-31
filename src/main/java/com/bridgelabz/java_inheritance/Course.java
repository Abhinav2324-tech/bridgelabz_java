package com.bridgelabz.java_inheritance;
/*
This program demonstrates multilevel inheritance using a Course system.
Course is the base class, OnlineCourse extends Course, and PaidOnlineCourse
extends OnlineCourse. Each level adds its own attributes and displayDetails()
is overridden to display all the course information.
*/

import java.util.Scanner;

class Course {

    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}

class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter course name:");
        String courseName = input.nextLine();

        System.out.println("Enter course duration in months:");
        int duration = input.nextInt();
        input.nextLine();

        System.out.println("Enter online platform:");
        String platform = input.nextLine();

        System.out.println("Is the course recorded? (true/false):");
        boolean isRecorded = input.nextBoolean();

        System.out.println("Enter course fee:");
        double fee = input.nextDouble();

        System.out.println("Enter discount percentage:");
        double discount = input.nextDouble();

        Course course = new PaidOnlineCourse(
                courseName, duration, platform, isRecorded, fee, discount
        );

        System.out.println("\nCourse Details:");
        course.displayDetails();

        input.close();
    }
}