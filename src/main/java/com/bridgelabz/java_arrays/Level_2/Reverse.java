package com.bridgelabz.java_arrays.Level_2;

/*
 * This program takes a number as input and reverses the number.
 * It finds the number of digits and stores each digit in an array.
 * It then stores the digits in reverse order in another array.
 * Finally, it displays the reversed number.
 */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number = ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }

        input.close();
    }
}