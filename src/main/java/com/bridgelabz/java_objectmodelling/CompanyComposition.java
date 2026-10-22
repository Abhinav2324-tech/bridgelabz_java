package com.bridgelabz.java_objectmodelling;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void display() {
        System.out.println("Department: " + name);

        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.name);
        }
    }

    void clearEmployees() {
        employees.clear();
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    void addEmployee(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.name.equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
    }

    void display() {
        System.out.println("Company: " + name);

        for (Department department : departments) {
            department.display();
        }
    }

    void deleteCompany() {
        for (Department department : departments) {
            department.clearEmployees();
        }

        departments.clear();
        System.out.println("Company departments and employees removed");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {

        Company company = new Company("Google");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployee("IT", "Rahul");
        company.addEmployee("IT", "Amit");
        company.addEmployee("HR", "Priya");

        company.display();

        company.deleteCompany();

        company.display();
    }
}