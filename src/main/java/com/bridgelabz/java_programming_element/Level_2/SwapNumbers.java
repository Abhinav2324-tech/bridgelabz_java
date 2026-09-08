package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * Program to take two numbers as input
 * and swap their values using a temporary variable.
 */
public class SwapNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number1;
        System.out.println("Enter number 1:");
        number1=input.nextInt();
        int number2;
        System.out.println("Enter number 2:");
        number2=input.nextInt();
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("The swapped numbers are "+number1+" and "+number2);
        input.close();
    }
}
