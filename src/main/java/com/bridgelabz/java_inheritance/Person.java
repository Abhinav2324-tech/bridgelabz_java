package com.bridgelabz.java_inheritance;
/*
This program demonstrates hierarchical inheritance using a school system.
Person is the superclass, while Teacher, Student, and Staff are subclasses.
Each subclass inherits the common attributes name and age and adds its own
unique attribute. Each subclass overrides displayRole() to show its role.
*/

import java.util.Scanner;

class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: Person");
    }
}

class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {

    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {

    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Teacher name:");
        String teacherName = input.nextLine();

        System.out.println("Enter Teacher age:");
        int teacherAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter Teacher subject:");
        String subject = input.nextLine();

        System.out.println("Enter Student name:");
        String studentName = input.nextLine();

        System.out.println("Enter Student age:");
        int studentAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter Student grade:");
        String grade = input.nextLine();

        System.out.println("Enter Staff name:");
        String staffName = input.nextLine();

        System.out.println("Enter Staff age:");
        int staffAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter Staff department:");
        String department = input.nextLine();

        Person teacher = new Teacher(teacherName, teacherAge, subject);
        Person student = new Student(studentName, studentAge, grade);
        Person staff = new Staff(staffName, staffAge, department);

        System.out.println("\nTeacher Details:");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println("\nStudent Details:");
        student.displayRole();
        student.displayDetails();

        System.out.println("\nStaff Details:");
        staff.displayRole();
        staff.displayDetails();

        input.close();
    }
}
