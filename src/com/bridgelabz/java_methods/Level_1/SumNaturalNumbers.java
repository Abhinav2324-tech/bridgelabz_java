package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program finds the sum of n natural numbers using a loop.
 * It takes a natural number as input from the user.
 * It uses a method to calculate the sum of natural numbers from 1 to n.
 * Finally, it displays the calculated sum.
 */
public class SumNaturalNumbers {

    public int findSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        SumNaturalNumbers obj = new SumNaturalNumbers();

        int sum = obj.findSum(number);

        System.out.println("Sum of natural numbers = " + sum);

        input.close();
    }
}