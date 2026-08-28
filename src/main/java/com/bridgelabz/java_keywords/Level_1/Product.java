package com.bridgelabz.java_keywords.Level_1;

/*
This program creates a Product class to demonstrate static, this,
final, and instanceof. The discount is shared among all products,
productID cannot be changed once assigned, this is used in the
constructor, and instanceof checks whether an object is a Product.
*/

import java.util.Scanner;

public class Product {

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    private static double discount = 10.0;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product ID:");
        int productID = input.nextInt();
        input.nextLine();

        System.out.println("Enter product name:");
        String productName = input.nextLine();

        System.out.println("Enter price:");
        double price = input.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();

        System.out.println("Enter new discount percentage:");
        double newDiscount = input.nextDouble();

        Product product =
                new Product(productName, price, quantity, productID);

        Product.updateDiscount(newDiscount);

        if (product instanceof Product) {
            product.displayDetails();
        }

        input.close();
    }
}