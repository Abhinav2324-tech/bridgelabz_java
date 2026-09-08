package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program calculates the number of rounds an athlete needs to run
 * around a triangular field to complete a distance of 5 kilometers.
 * It takes the three sides of the triangle as input from the user.
 * Finally, it calculates and displays the total number of rounds required.
 */
public class Athlete {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double side1,side2,side3;
        System.out.println("Enter side 1 of triangle:");
        side1=input.nextDouble();
        System.out.println("Enter side 2 of triangle:");
        side2=input.nextDouble();
        System.out.println("Enter side 3 of triangle:");
        side3=input.nextDouble();
        double distance=5000;
        double perimeter=side1+side2+side3;
        double rounds=(int)Math.ceil(distance/perimeter);
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
        input.close();
    }

}
