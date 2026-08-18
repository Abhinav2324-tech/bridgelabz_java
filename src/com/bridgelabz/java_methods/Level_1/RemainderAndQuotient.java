package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program finds the quotient and remainder of two numbers.
 * It takes a number and divisor as input from the user.
 * It creates an object and calls a method to calculate the quotient and remainder.
 * Finally, it displays the quotient and remainder.
 */

public class RemainderAndQuotient {
    public int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;

        int[] result={quotient,remainder};
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        System.out.println("Enter the divisor:");
        int divisor=input.nextInt();
        RemainderAndQuotient obj=new RemainderAndQuotient();
        int[] result= obj.findRemainderAndQuotient(number,divisor);
        System.out.println("The quotient is: "+result[0]);
        System.out.println("The remainder is: "+result[1]);
        input.close();

    }
}
