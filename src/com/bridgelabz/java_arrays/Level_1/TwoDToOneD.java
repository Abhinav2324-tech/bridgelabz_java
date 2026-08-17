package com.bridgelabz.java_arrays.Level_1;
/*
 * This program creates a two-dimensional array using user input.
 * It takes the number of rows, columns, and matrix elements from the user.
 * It copies all the elements of the 2D array into a 1D array.
 * Finally, it displays the elements of the 1D array.
 */

import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = input.nextInt();

        System.out.println("Enter number of columns:");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];


        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }


        int[] array = new int[rows * columns];
        int index = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                array[index] = matrix[i][j];
                index++;
            }
        }


        System.out.println("Elements of 1D array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}