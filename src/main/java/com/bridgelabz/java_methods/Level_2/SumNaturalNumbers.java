package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;
/*
 * This program finds the sum of n natural numbers using recursion.
 * It also calculates the sum using the formula n * (n + 1) / 2.
 * It compares both results to verify that the computations are correct.
 * Finally, it displays both sums and the comparison result.
 */
public class SumNaturalNumbers {
    public int recursiveSum(int number){
        if(number==1){
            return 1;
        }
        return number+recursiveSum(number-1);
    }
    public double formulaSum(int number){
        return number*(number+1)/2 ;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number=input.nextInt();
        if(number<=0){
            System.out.println("Enter a valid number");
            input.close();
            return;
        }
        SumNaturalNumbers obj=new SumNaturalNumbers();
        int recursiveResult=obj.recursiveSum(number);
        double formulaResult=obj.formulaSum(number);
        System.out.println("Sum using recursion:"+recursiveResult);
        System.out.println("Sum using formula:"+formulaResult);
        if(recursiveResult==formulaResult){
            System.out.println("Both computations are equal.");
        }
        else{
            System.out.println("Both computations are not equal.");
        }
        input.close();
    }
}
