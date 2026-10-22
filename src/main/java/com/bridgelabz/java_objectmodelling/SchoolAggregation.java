package com.bridgelabz.java_objectmodelling;

import java.util.*;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    void displayStudents() {
        System.out.println("Course: " + name);

        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    void displayCourses() {
        System.out.println("Student: " + name);

        for (Course course : courses) {
            System.out.println(course.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolAggregation {
    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        s1.displayCourses();
        s2.displayCourses();

        c1.displayStudents();
        c2.displayStudents();
    }
}
