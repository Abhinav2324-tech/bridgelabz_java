package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program checks whether the first number is the smallest among three numbers.
 * It takes three numbers as input from the user.
 * It compares the first number with the second and third numbers.
 * Finally, it displays true if the first number is the smallest, otherwise false.
 */
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1;
        System.out.println("Enter number1:");
        number1=input.nextInt();
        int number2;
        System.out.println("Enter number2:");
        number2=input.nextInt();
        int number3;
        System.out.println("Enter number3:");
        number3=input.nextInt();
        boolean result=(number1<number2)&&(number1<number3);
        System.out.println(" Is the first number the smallest? "+result);
        input.close();
    }
}
