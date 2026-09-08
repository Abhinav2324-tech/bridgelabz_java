package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take height in centimeters as input
 * and convert it into feet and inches.
 * 1 foot = 12 inches and 1 inch = 2.54 cm.
 */
public class Height {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double heightCm;
        System.out.println("Enter height in centimeters:");
        heightCm=input.nextDouble();
        double heightIn=heightCm/2.54;//Formula for height in inches
        double heightFeet=(int)(heightIn/12);//formula for height in feet
        System.out.println("Your Height in cm is "+heightCm+" while in feet is "+heightFeet+" and inches is "+heightIn);
        input.close();
    }
}
