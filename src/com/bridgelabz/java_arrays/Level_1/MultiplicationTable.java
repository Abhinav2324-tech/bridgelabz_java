package com.bridgelabz.java_arrays.Level_1;
import java.util.Scanner;
/*
 * This program prints the multiplication table of a given number.
 * It takes a number as input from the user.
 * It stores the multiplication results from 1 to 10 in an array.
 * Finally, it displays the multiplication table using the stored results.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int[] multiplicationTable =new int[10];
        for(int i=1;i<=10;i++){
            multiplicationTable[i-1]=n*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+multiplicationTable[i-1]);
        }
        input.close();
    }
}
