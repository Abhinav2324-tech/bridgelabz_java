package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program checks whether a given number is divisible by 5.
 * It takes a number as input from the user.
 * It uses the modulus operator to check the divisibility.
 * Finally, it displays true if the number is divisible by 5, otherwise false.
 */
public class Divisibility {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=input.nextInt();
        boolean result= number%5==0;
        System.out.println(" Is the number "+number+" divisible by 5? "+result);
        input.close();
    }
}
