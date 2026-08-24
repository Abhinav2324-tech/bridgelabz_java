package com.bridgelabz.oops_concept.class_and_objects.Level_1;
import java.util.Scanner;
/*
This program creates an Employee class with name, id, and salary.
It takes employee details from the user, creates an Employee object
using a constructor, and displays the employee details.
*/
public class EmployeeDetails {
    String name;
    int id;
    double salary;
            public EmployeeDetails(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
            }
            public void displayDetails(){
                System.out.println("The name of the Employee is:"+name);
                System.out.println("The id of the Employee is:"+id);
                System.out.println( "The salary of the Employee is:"+salary);
            }
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee ID: ");
        int id = input.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        EmployeeDetails employee = new EmployeeDetails(name, id, salary);

        employee.displayDetails();

        input.close();
    }
}



