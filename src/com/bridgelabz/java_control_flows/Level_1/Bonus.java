package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;

/*
 * Program to take salary and years of service as input
 * and calculate a 5% bonus if the employee has
 * more than 5 years of service.
 */
public class Bonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the salary:");
        double salary = input.nextDouble();

        System.out.println("Enter years of service:");
        int yearsOfService = input.nextInt();

double bonus=0;
        if (yearsOfService > 5) {
             bonus = salary * 5 / 100;
        }

        System.out.println("The bonus amount is " + bonus);

        input.close();
    }
}