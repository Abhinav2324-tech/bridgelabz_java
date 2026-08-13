package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take the base and height of a triangle as input
 * and calculate its area in square centimeters
 * and square inches.
 * Formula: Area = 1/2 * base * height.
 */
public class Triangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double base;
        double height;
        System.out.println("The base of the triangle is:");
        base=input.nextDouble();
        System.out.println("The height of the triangle is:");
        height=input.nextDouble();
        double areaCm=(1.0/2.0)*base*height;
        double areaIn=areaCm*0.155;//Formula to convert area into square inches
        System.out.println("Area of triangle in centimeter square is "+areaCm+" and in square inches is "+areaIn);
        input.close();
    }
}
