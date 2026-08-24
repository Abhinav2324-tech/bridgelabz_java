package com.bridgelabz.oops_concept.class_and_objects.Level_2;
import java.util.Scanner;

public class StudentGrade {
    String name;
    int rollNumber;
    int marks;
    public StudentGrade(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String calculateGrade(){
        if(marks>=90){
            return "A";
        }
        else if(marks>=80){
            return "B";
        }
        else if(marks>=70){
            return "C";
        }
        else if(marks>=60){
            return "D";
        }
        else{
            return "F";
        }
    }
    public void displayDetails(){
        System.out.println("Name of the student is:"+name);
        System.out.println("Roll Number of the student is:"+rollNumber);
        System.out.println("Marks of the student is:"+marks);
        System.out.println("Grade obatined:"+calculateGrade());
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name=input.nextLine();
        System.out.println("Enter the roll number:");
        int rollNumber=input.nextInt();
        System.out.println("Enter the marks obtained:");
        int marks=input.nextInt();
        StudentGrade student=new StudentGrade(name,rollNumber,marks);
        student.displayDetails();
       input.close();
    }
}
