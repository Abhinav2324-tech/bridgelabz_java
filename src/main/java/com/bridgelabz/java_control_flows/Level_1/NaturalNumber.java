package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program calculates the sum of natural numbers up to a given number.
 * It takes a number as input from the user.
 * It checks whether the entered number is a natural number.
 * Finally, it calculates and displays the sum of the natural numbers.
 */
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=input.nextInt();
        if(number>0){
            double sum=number*(number+1)/2.0;
            System.out.println("The sum of "+number+" natural numbers is "+sum);
        }
        else{
            System.out.println("The number "+number+" is not a natural number");
        }
        input.close();
    }
}
