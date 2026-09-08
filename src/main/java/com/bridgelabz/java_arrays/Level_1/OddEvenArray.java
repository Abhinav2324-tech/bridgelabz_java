package com.bridgelabz.java_arrays.Level_1;
/*
 * This program stores odd and even numbers in separate arrays.
 * It takes a natural number as input from the user.
 * It finds all odd and even numbers from 1 up to the entered number.
 * Finally, it displays the odd and even numbers separately.
 */

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();


        if (number <= 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;


        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }


        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }


        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odd[i]);
        }

        input.close();
    }
}