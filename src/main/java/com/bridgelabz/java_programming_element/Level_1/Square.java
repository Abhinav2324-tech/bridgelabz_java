package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take the perimeter of a square as input
 * and calculate the length of its side.
 * Formula: Side = Perimeter / 4.
 */
public class Square {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double perimeter;
        System.out.println("Enter the perimeter of the square:");
        perimeter=input.nextDouble();
        double side=perimeter/4.0;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
        input.close();
    }
}
