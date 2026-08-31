package com.bridgelabz.java_inheritance;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private int salary;
    public Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary);
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager(String name,int id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size is:"+teamSize);
    }
}
class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name,int id, int salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language:"+programmingLanguage);
    }
}
class Intern extends Employee{
    private int duration;
    Intern(String name,int id,int salary,int duration){
        super(name, id, salary);
        this.duration=duration;
        System.out.println("Internship duration is: "+duration+" months");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Manager name:");
        String managerName = input.nextLine();

        System.out.println("Enter Manager ID:");
        int managerId = input.nextInt();

        System.out.println("Enter Manager salary:");
        int managerSalary = input.nextInt();

        System.out.println("Enter Manager team size:");
        int teamSize = input.nextInt();
        input.nextLine();

        System.out.println("Enter Developer name:");
        String developerName = input.nextLine();

        System.out.println("Enter Developer ID:");
        int developerId = input.nextInt();

        System.out.println("Enter Developer salary:");
        int developerSalary = input.nextInt();
        input.nextLine();

        System.out.println("Enter programming language:");
        String programmingLanguage = input.nextLine();

        System.out.println("Enter Intern name:");
        String internName = input.nextLine();

        System.out.println("Enter Intern ID:");
        int internId = input.nextInt();

        System.out.println("Enter Intern salary:");
        int internSalary = input.nextInt();

        System.out.println("Enter internship duration in months:");
        int internshipDuration = input.nextInt();

        Employee manager=new Manager(managerName,managerId,managerSalary,teamSize);
        Employee developer=new Developer(developerName,developerId,developerSalary,programmingLanguage);
        Employee intern=new Intern(internName,internId,internSalary,internshipDuration);

        System.out.println("\nManager details:");
        manager.displayDetails();

        System.out.println("\nDeveloper details:");
        developer.displayDetails();

        System.out.println("\nInter details:");
        intern.displayDetails();

        input.close();
    }
}
