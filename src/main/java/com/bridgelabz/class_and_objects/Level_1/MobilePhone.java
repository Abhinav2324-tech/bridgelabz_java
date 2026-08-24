package com.bridgelabz.class_and_objects.Level_1;
import java.util.Scanner;
/*
This program creates a MobilePhone class with brand, model, and price.
It takes mobile phone details from the user, creates a MobilePhone
object using a constructor, and displays all the phone details.
*/
public class MobilePhone {

    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter phone brand: ");
        String brand = input.nextLine();

        System.out.print("Enter phone model: ");
        String model = input.nextLine();

        System.out.print("Enter phone price: ");
        double price = input.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);

        phone.displayDetails();

        input.close();
    }
}