package com.bridgelabz.java_streamapi;
import java.util.*;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Highest {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 85),
                new Student("Priya", 95),
                new Student("Amit", 78),
                new Student("Sneha", 90)
        );

        Student topper = students.stream()
                .max(Comparator.comparingInt(s -> s.marks))
                .orElse(null);

        if (topper != null) {
            System.out.println(topper.name + " " + topper.marks);
        }
    }
}