package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take distance in feet as input
 * and convert it into yards and miles.
 * 1 yard = 3 feet and 1 mile = 1760 yards.
 */
public class YardsAndMiles {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double distanceInFeet;
        System.out.println("Enter the distance in Feet:");
        distanceInFeet=input.nextDouble();
        double yards=distanceInFeet/3.0;
        double miles=yards/1760;
        System.out.println("The distance in feet is "+distanceInFeet+", the distance in yards is "+yards+" and the distance in miles is "+miles);
        input.close();
    }

}
