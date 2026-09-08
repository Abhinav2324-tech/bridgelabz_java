package com.bridgelabz.java_arrays.Level_2;
/*
 * This program finds the youngest and tallest among Amar, Akbar, and Anthony.
 * It takes their ages and heights as input and stores them in arrays.
 * It compares their ages to find the youngest friend.
 * It compares their heights to find the tallest friend.
 * Finally, it displays the youngest and tallest friend.
 */

import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = input.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;


        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend is " + names[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex]);

        input.close();
    }
}