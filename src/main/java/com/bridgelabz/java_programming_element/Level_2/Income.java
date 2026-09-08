package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program calculates the total income of an employee.
 * It takes the salary and bonus amount as input from the user.
 * It calculates the total income by adding the salary and bonus.
 * Finally, it displays the salary, bonus, and total income of the employee.
 */
public class Income {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double salary;
        System.out.println("Enter salary of the employee:");
        salary=input.nextDouble();
        double bonus;
        System.out.println("Enter the bonus received:");
        bonus=input.nextDouble();
        double income=salary+bonus;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+".Hence Total Income is INR "+income);
        input.close();
    }
}
