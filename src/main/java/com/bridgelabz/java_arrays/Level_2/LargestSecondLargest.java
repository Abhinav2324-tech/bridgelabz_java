package com.bridgelabz.java_arrays.Level_2;

/*
 * This program takes a number as input and stores its digits in an array.
 * It finds the largest and second largest digit from the stored digits.
 * Finally, it displays the largest and second largest digits.
 */

import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {

            digits[index] = number % 10;
            number = number / 10;

            index++;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        input.close();
    }
}