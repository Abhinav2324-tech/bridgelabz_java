package com.bridgelabz.java_programming_element.Level_1;
/*
 * Program to calculate the discount amount and final course fee
 * for a fee of INR 125000 with a 10% discount.
 * Discount = Fee * Discount Percentage / 100.
 */
public class Fee {
    public static void main(String[] args){
        double fee=125000;
        double discountPercent=10;
        double discount=fee*discountPercent/100;
        double discountedPrice=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedPrice);
    }
}
