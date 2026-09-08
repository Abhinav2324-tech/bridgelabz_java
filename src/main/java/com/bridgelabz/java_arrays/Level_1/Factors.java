package com.bridgelabz.java_arrays.Level_1;
/*
 * This program finds all the factors of a number entered by the user.
 * It stores the factors in an array.
 * If the array becomes full, its size is increased to store more factors.
 * Finally, it displays all the factors of the given number.
 */

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;


        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Increase array size if it is full
                if (index == maxFactor) {

                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    // Copy old factors into new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }


        System.out.println("Factors of " + number + " are:");

        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        input.close();
    }
}
