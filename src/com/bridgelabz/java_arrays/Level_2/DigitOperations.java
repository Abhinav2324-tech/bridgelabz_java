package com.bridgelabz.java_arrays.Level_2;
/*
 * This program takes a number as input and stores all its digits in an array.
 * If the array becomes full, its size is increased by 10 to store more digits.
 * It finds and displays the largest and second largest digits.
 * It also reverses the number by displaying the stored digits in reverse order.
 */

import java.util.Scanner;

public class DigitOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        long number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {

            if (index == maxDigit) {

                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
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

        System.out.print("Reverse number = ");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}