package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take distance in kilometers as input
 * and convert it into miles.
 * 1 mile = 1.6 kilometers.
 */
public class KmToMiles {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double km;
        double miles;
        System.out.println("Enter distance in kilometres: ");
        km=input.nextDouble();
        miles=km/1.6;
        System.out.println("The total miles is "+miles+" for the given "+km+" km");
        input.close();

    }
}
