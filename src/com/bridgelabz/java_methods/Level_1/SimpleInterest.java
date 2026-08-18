package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program calculates the Simple Interest using a method.
 * It takes the principal, rate of interest, and time as input from the user.
 * It creates an object and calls the method to calculate Simple Interest.
 * Finally, it displays the Simple Interest along with the entered values.
 */
public class SimpleInterest {
    public double calculateSimpleInterest(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal=input.nextDouble();
        System.out.println("Enter the rate:");
        double rate=input.nextDouble();
        System.out.println("Enter the time:");
        double time=input.nextDouble();
        SimpleInterest obj=new SimpleInterest();
        double simpleInterest=obj.calculateSimpleInterest(principal,rate,time);
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        input.close();
    }
}
