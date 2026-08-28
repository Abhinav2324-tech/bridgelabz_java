package com.bridgelabz.java_constructors.Level_2;
import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName="Bridgelabz";
    public Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void displayCourseDetails(){
        System.out.println("Name of the course:"+courseName);
        System.out.println("Duration of the course:"+duration);
        System.out.println("Fee:"+fee);
        System.out.println("Institute name:"+instituteName);
    }
    public static void updateInstituteName(String newInstitute){
        instituteName=newInstitute;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of course 1:");
        String name1=input.nextLine();
        System.out.println("Enter the duration of course 1:");
        int duration1=input.nextInt();
        System.out.println("Enter the fee for course 1:");
        double fee1=input.nextDouble();
        input.nextLine();
        Course course1=new Course(name1,duration1,fee1);
        System.out.println("Enter the name of course 2:");
        String name2=input.nextLine();
        System.out.println("Enter the duration of course 2:");
        int duration2=input.nextInt();
        System.out.println("Enter the fee for course 2:");
        double fee2=input.nextDouble();
        input.nextLine();
        Course course2=new Course(name2,duration2,fee2);
        System.out.println("Enter new Institute name:");
        String newInstituteName=input.nextLine();
        Course.updateInstituteName(newInstituteName);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        input.close();
    }
}
