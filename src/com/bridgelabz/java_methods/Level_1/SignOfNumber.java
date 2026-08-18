package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program checks whether a given number is positive, negative, or zero.
 * It uses a method that returns 1 for a positive number, -1 for a negative number,
 * and 0 if the entered number is zero.
 */
public class SignOfNumber {
    public int checkNumber(int number){
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= input.nextInt();

        SignOfNumber obj=new SignOfNumber();
        int result=obj.checkNumber(number);
        System.out.println(result);
        input.close();
    }
}
