package com.bridgelabz.java_arrays.Level_1;
import java.util.Scanner;
/*
 * This program prints the multiplication table of a number from 6 to 9.
 * It takes a number as input from the user.
 * It stores the multiplication results from 6 to 9 in an array.
 * Finally, it displays the multiplication table using the stored results.
 */
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        int[] multiplicationTable=new int[4];
        for(int i=6;i<=9;i++){
            multiplicationTable[i-6]=number*i;
        }
        for(int i=6;i<=9;i++){
            System.out.println(number+"*"+i+" = "+multiplicationTable[i-6]);
        }
        input.close();
    }
}
