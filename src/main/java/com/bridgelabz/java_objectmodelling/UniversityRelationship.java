package com.bridgelabz.java_objectmodelling;
import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department1 {
    String name;

    Department1(String name) {
        this.name = name;
    }
}

class University {
    String name;

    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void display() {
        System.out.println("University: " + name);

        for (Department department : departments) {
            System.out.println("Department: " + department.name);
        }

        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.name);
        }
    }

    void deleteUniversity() {
        departments.clear();
        faculties.clear();

        System.out.println("University data removed");
    }
}

public class UniversityRelationship {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Kumar");
        Faculty f2 = new Faculty("Dr. Priya");

        University university = new University("SRM");

        university.addDepartment("CSE");
        university.addDepartment("ECE");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.display();

        university.deleteUniversity();

        System.out.println("Faculty still exists: " + f1.name);
    }
}