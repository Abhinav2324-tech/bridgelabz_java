package com.bridgelabz.class_and_objects.Level_2;
/*
This program creates a CartItem class with item name, price,
and quantity. It allows items to be added or removed
and calculates and displays the total cost.
*/

import java.util.Scanner;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int item) {
        quantity = quantity + item;
    }

    public void removeItem(int item) {
        if (item <= quantity) {
            quantity = quantity - item;
        } else {
            System.out.println("Cannot remove more items than available.");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter item name:");
        String itemName = input.nextLine();

        System.out.println("Enter item price:");
        double price = input.nextDouble();

        System.out.println("Enter initial quantity:");
        int quantity = input.nextInt();

        CartItem item = new CartItem(itemName, price, quantity);

        System.out.println("Enter quantity to add:");
        int addQuantity = input.nextInt();

        item.addItem(addQuantity);

        System.out.println("Enter quantity to remove:");
        int removeQuantity = input.nextInt();

        item.removeItem(removeQuantity);

        item.displayTotalCost();

        input.close();
    }
}