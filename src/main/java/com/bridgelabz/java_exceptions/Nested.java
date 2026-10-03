package com.bridgelabz.java_exceptions;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        try {

            int value = arr[index];

            try {

                int result = value / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        input.close();
    }
}
