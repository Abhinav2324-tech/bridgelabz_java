package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program checks which of the three given numbers is the largest.
 * It takes three numbers as input from the user.
 * It compares the numbers using boolean conditions.
 * Finally, it displays whether each number is the largest or not.
 */
public class LargestNumber {
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
        boolean largest1=(number1>number2)&&(number1>number3);
        boolean largest2=(number2>number1)&&(number2>number3);
        boolean largest3=(number3>number1)&&(number3>number2);
        System.out.println("Is the first number the largest? "+largest1);
        System.out.println("Is the second number the largest? "+largest2);
        System.out.println("Is the third number the largest? "+largest3);
        input.close();
    }
}
