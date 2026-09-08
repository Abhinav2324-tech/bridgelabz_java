package com.bridgelabz.java_arrays.Level_2;
/*
 * This program calculates the bonus for 10 employees based on their years of service.
 * Employees with more than 5 years of service get a 5% bonus,
 * while employees with 5 years or less get a 2% bonus.
 * It calculates the bonus, new salary, total old salary,
 * total bonus amount, and total new salary of all employees.
 */

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;


        for (int i = 0; i < 10; i++) {

            System.out.println("Enter salary of employee " + (i + 1) + ":");
            salary[i] = input.nextDouble();

            System.out.println("Enter years of service:");
            yearsOfService[i] = input.nextDouble();


            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }


        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 5 / 100;
            } else {
                bonus[i] = salary[i] * 2 / 100;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus = totalBonus + bonus[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];

            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary = " + salary[i]);
            System.out.println("Bonus = " + bonus[i]);
            System.out.println("New Salary = " + newSalary[i]);
        }

        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}