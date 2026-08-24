package com.bridgelabz.java_constructors.Level_1;
/*
This program creates a CarRental class with customer name,
car model, and rental days. It initializes rental details
using a constructor and calculates the total rental cost.
*/

import java.util.Scanner;

public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    public CarRental(String customerName, String carModel,
                     int rentalDays, double costPerDay) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = input.nextLine();

        System.out.println("Enter car model:");
        String carModel = input.nextLine();

        System.out.println("Enter number of rental days:");
        int rentalDays = input.nextInt();

        System.out.println("Enter cost per day:");
        double costPerDay = input.nextDouble();

        CarRental rental =
                new CarRental(customerName, carModel, rentalDays, costPerDay);

        rental.displayDetails();

        input.close();
    }
}