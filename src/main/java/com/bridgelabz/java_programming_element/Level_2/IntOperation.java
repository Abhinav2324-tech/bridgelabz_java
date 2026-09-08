package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;

/*
 * Program to take three integer values a, b and c as input
 * and perform different integer operations.
 * This program also demonstrates operator precedence.
 */
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = input.nextInt();

        System.out.println("Enter value of b:");
        int b = input.nextInt();

        System.out.println("Enter value of c:");
        int c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
