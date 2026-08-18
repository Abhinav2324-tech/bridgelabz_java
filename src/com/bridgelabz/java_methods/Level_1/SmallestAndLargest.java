package com.bridgelabz.java_methods.Level_1;

import java.util.Scanner;
/*
 * This program finds the smallest and largest among three numbers.
 * It takes three numbers as input from the user.
 * It creates an object and calls a method to find the smallest and largest numbers.
 * Finally, it displays the smallest and largest values.
 */
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest=number1;
        int largest=number1;
        if(number2<smallest)
            smallest=number2;
        if(number3<smallest)
            smallest=number3;
        if(number2>largest)
            largest=number2;
        if(number3>largest)
            largest=number3;

        int[] result = {smallest, largest};
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=input.nextInt();
        System.out.println("Enter number2:");
        int number2=input.nextInt();
        System.out.println("Enter number3:");
        int number3=input.nextInt();
        SmallestAndLargest obj=new SmallestAndLargest();
        int[] result = obj.findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest: "+result[0]);
        System.out.println("Largest: "+result[1]);
        input.close();
    }
}
