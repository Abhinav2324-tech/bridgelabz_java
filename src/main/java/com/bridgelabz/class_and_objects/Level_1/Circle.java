package com.bridgelabz.class_and_objects.Level_1;
import java.util.Scanner;

public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    public void displayDetails(){
        System.out.println("Radius of the circle is:"+radius);
        System.out.println("The area of the circle is:"+calculateArea());
        System.out.println("The circumference of the circle is:"+calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=input.nextDouble();
        Circle circle=new Circle(radius);
        circle.displayDetails();
        input.close();
    }
}
