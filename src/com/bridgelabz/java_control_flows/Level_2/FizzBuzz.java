package com.bridgelabz.java_control_flows.Level_2;
import  java.util.Scanner;
/*
 * Program to take a positive integer as input
 * and print Fizz for multiples of 3, Buzz for multiples of 5,
 * and FizzBuzz for multiples of both using a for loop.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        double number=input.nextDouble();
        if(number>0){
            for(int i=0;i<=number;i++){
                if(i%3==0&&i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Enter a positive integer");
        }
        input.close();
    }
}
