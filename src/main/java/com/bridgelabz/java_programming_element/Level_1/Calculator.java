package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take two numbers as input
 * and perform addition, subtraction, multiplication,
 * and division on the given numbers.
 */
public class Calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float number1;
        System.out.println("Enter the number 1:");
        number1=input.nextFloat();
        float number2;
        System.out.println("Enter number 2:");
        number2=input.nextFloat();
        float addition=number1+number2;
        float subtraction=number2-number1;
        float multiplication=number1*number2;
        float division=number2/number1;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+" , "+subtraction+" , "+multiplication+" and "+division);
        input.close();
    }

}
