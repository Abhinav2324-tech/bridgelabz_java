package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program converts a person's weight from pounds to kilograms.
 * It takes the weight in pounds as input from the user.
 * It calculates the weight in kilograms using the conversion formula.
 * Finally, it displays the weight in both pounds and kilograms.
 */
public class PoundsToKilograms {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double pound;
        System.out.println("Enter weight of the person in pounds:");
        pound=input.nextDouble();

        double kilograms=pound/2.2;
        System.out.println("The weight of the person in pound is "+pound+" and in kg is "+kilograms);
    }
}
