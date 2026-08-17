package com.bridgelabz.java_arrays.Level_2;

/*
 * This program takes a number as input and finds the frequency of each digit.
 * It stores the digits of the number in an array.
 * It uses a frequency array to count how many times each digit occurs.
 * Finally, it displays the frequency of each digit present in the number.
 */

import java.util.Scanner;

public class DigitFrequency {
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

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Frequency of digits:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " = " + frequency[i]);
            }
        }

        input.close();
    }
}
