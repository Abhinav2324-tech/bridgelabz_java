package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take the student fee and discount percentage as input
 * and calculate the discount amount and final discounted fee.
 * Discount = Fee * Discount Percentage / 100.
 */
public class UniversityFee {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double fee;
        double discountPercent;
        System.out.println("Enter the student fee: ");
        fee=input.nextDouble();
        System.out.println("Enter the discount percentage: ");
        discountPercent=input.nextDouble();
        double discount=fee*discountPercent/100;
        double discountedPrice=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedPrice);
        input.close();
    }
}
