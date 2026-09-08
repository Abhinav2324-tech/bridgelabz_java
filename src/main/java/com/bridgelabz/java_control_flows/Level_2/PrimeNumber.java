package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;
/*
 * This program checks whether a given number is a prime number or not.
 * It takes a number as input from the user.
 * It checks if the number is divisible by any number other than 1 and itself.
 * Finally, it displays whether the given number is prime or not.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number+" Is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
        input.close();
    }
}
