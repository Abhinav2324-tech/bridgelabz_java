package com.bridgelabz.java_arrays.Level_1;
/*
 * This program performs the FizzBuzz operation for numbers from 1 to a user-entered number.
 * It stores "Fizz" for multiples of 3 and "Buzz" for multiples of 5.
 * It stores "FizzBuzz" for numbers that are multiples of both 3 and 5.
 * Finally, it displays the stored results along with their positions.
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int number = input.nextInt();


        if (number <= 0) {
            System.out.println("Enter a positive integer");
            input.close();
            return;
        }

        String[] result = new String[number];


        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            }
            else {
                result[i - 1] = String.valueOf(i);
            }
        }


        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }

        input.close();
    }
}
