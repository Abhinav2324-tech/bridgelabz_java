package com.bridgelabz.java_abstraction;
import java.util.Scanner;

interface Department{
    void assignDepartment(String department);
    void getDepartmentDetails();
}
abstract class Employee implements Department{
    private int employeeID;
    private String name;
    private double baseSalary;
    Employee(int employeeID,String name,double baseSalary){
        this.employeeID=employeeID;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public  double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double salary){
        this.baseSalary=baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+baseSalary);
        getDepartmentDetails();
    }
}
class FullTimeEmployee extends Employee{
    private String department;
    FullTimeEmployee(int employeeID,String name,double baseSalary){
        super(employeeID, name, baseSalary);
    }
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department is: "+department);
    }
    public double calculateSalary(){
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee{
    private String department;
    private int workHours;
    PartTimeEmployee(int employeeID, String name, double baseSalary,int workHours){
        super(employeeID, name, baseSalary);
        this.workHours=workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()*workHours;
    }
    public void assignDepartment(String Department){
        this.department=department;
    }
    public void getDepartmentDetails(){
        System.out.println("Department: "+department);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full time employee ID:");
        int fullTimeID=input.nextInt();
        input.nextLine();
        System.out.println("Enter full time employee name:");
        String fullTimeName=input.nextLine();
        System.out.println("Enter full time employee salary:");
        double fullTimeSalary=input.nextDouble();
        input.nextLine();
        System.out.println("Enter full time employee department:");
        String fullTimeDepartment=input.nextLine();
        System.out.println("Enter part time employee ID:");
        int partTimeID=input.nextInt();
        input.nextLine();
        System.out.println("Enter part time employee name:");
        String parTimeName=input.nextLine();
        System.out.println("Enter part time employee hourly salary:");
        double hourlySalary=input.nextDouble();
        System.out.println("Enter the part time employee work hours:");
        int workHours=input.nextInt();
        input.nextLine();
        System.out.println("Enter part time employee department:");
        String partTimeDepartment=input.nextLine();
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(fullTimeID,fullTimeName,fullTimeSalary);
        PartTimeEmployee partTimeEmployee=new PartTimeEmployee(partTimeID,parTimeName,hourlySalary,workHours);

        fullTimeEmployee.assignDepartment(fullTimeDepartment);
        partTimeEmployee.assignDepartment(partTimeDepartment);

        Employee[] employees=new Employee[2];
        employees[0]=fullTimeEmployee;
        employees[1]=partTimeEmployee;
        System.out.println("\nEmployee details");
        for(int i=0;i< employees.length;i++){
            employees[i].displayDetails();
            System.out.println();
        }
        input.close();
    }
}

