package com.bridgelabz.java_keywords;
import java.util.Scanner;

public class Employee {
    private String name;
    private final int id;
    private String designation;
    private static String companyName="BridgeLabz";
    public Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
    }
    public static void displayCompanyName(){
        System.out.println("Company Name:"+companyName);
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Designation"+designation);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee's name:");
        String name=input.nextLine();
        System.out.println("Enter the employee's id:");
        int id=input.nextInt();
        input.nextLine();
        System.out.println("Enter the employee's designation:");
        String designation=input.nextLine();
        Employee employee=new Employee(name,id,designation);
        Employee.displayCompanyName();
        if(employee instanceof Employee){
            employee.displayDetails();
        }
        input.close();
    }
}
