package com.bridgelabz.java_programming_element.Level_1;

import java.util.Scanner;
/*
 * Program to calculate the maximum number of handshakes
 * among N students using the formula n * (n - 1) / 2.
 */
public class Handshake {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents;
        int handshakes;

        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);

        input.close();
    }
}
