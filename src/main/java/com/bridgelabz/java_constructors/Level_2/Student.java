package com.bridgelabz.java_constructors.Level_2;
import java.util.Scanner;

 class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;
    public Student(int rollNumber,String name,double cgpa){
        this.name=name;
        this.rollNumber=rollNumber;
        this.cgpa=cgpa;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double cgpa){
        this.cgpa=cgpa;
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("RollNumber:"+rollNumber);
        System.out.println("CGPA"+cgpa);
    }
}
 class PostGraduateStudent extends Student{
        public PostGraduateStudent(int rollNumber,String name,double cgpa){
            super(rollNumber, name, cgpa);
        }
        public void displayProtectedName(){
            System.out.println("Protected Name:"+name);
        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter roll number:");
        int rollNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter student name:");
        String name = input.nextLine();

        System.out.println("Enter CGPA:");
        double CGPA = input.nextDouble();

        PostGraduateStudent student =
                new PostGraduateStudent(rollNumber, name, CGPA);

        student.displayDetails();

        System.out.println("Enter new CGPA:");
        double newCGPA = input.nextDouble();

        student.setCGPA(newCGPA);

        System.out.println("Updated CGPA: " + student.getCGPA());

        student.displayProtectedName();

        input.close();
    }
}

