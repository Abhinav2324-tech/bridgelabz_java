package com.bridgelabz.java_arrays.Level_1;
/*
 * This program stores up to 10 positive numbers in an array.
 * It stops taking input if the user enters zero or a negative number.
 * It displays all the numbers stored in the array.
 * Finally, it calculates and displays the sum of all the numbers.
 */

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.println("Enter a number:");
            double number = input.nextDouble();


            if (number <= 0) {
                break;
            }


            if (index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("The numbers are:");


        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        System.out.println("The total is " + total);

        input.close();
    }
}
