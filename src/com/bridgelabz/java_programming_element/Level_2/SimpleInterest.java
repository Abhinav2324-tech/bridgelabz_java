package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program calculates the Simple Interest.
 * It takes the principal amount, rate of interest, and time as input from the user.
 * It calculates the Simple Interest using the given formula.
 * Finally, it displays the calculated Simple Interest.
 */
public class SimpleInterest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double principal;
        double rate;
        double time;
        System.out.println("Enter the principal amount:");
        principal=input.nextDouble();
        System.out.println("Enter the rate:");
        rate=input.nextDouble();
        System.out.println("Enter the time:");
        time=input.nextDouble();
        double simpleInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        input.close();
    }
}
