package com.bridgelabz.java_programming_element.Level_1;
import java.util.Scanner;
/*
 * Program to take the unit price and quantity as input
 * and calculate the total purchase price.
 * Formula: Total Price = Unit Price * Quantity.
 */
public class PurchasePrice {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int unitPrice;
        System.out.println("Enter the unit price:");
        unitPrice=input.nextInt();
        int quantity;
        System.out.println("Enter the quantity:");
        quantity=input.nextInt();
        int totalPrice=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
        input.close();
    }
}
