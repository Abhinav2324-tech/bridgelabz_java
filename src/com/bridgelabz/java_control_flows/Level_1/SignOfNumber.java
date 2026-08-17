package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program checks the sign of a given number.
 * It takes an integer as input from the user.
 * It checks whether the number is positive, negative, or zero.
 * Finally, it displays the appropriate result.
 */
public class SignOfNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = input.nextInt();
        if (n > 0)
            System.out.println("The number is Positive");
        else if (n < 0)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is Zero");
        input.close();
    }
}
