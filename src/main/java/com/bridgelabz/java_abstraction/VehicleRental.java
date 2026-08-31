package com.bridgelabz.java_abstraction;
/*
This program demonstrates a Vehicle Rental Management System using
abstraction, inheritance, encapsulation, interfaces, method overriding,
and polymorphism. Car, Bike, and Truck calculate rental and insurance
costs differently.
*/

import java.util.Scanner;

interface Insurable {

    double calculateInsurance();

    void getInsuranceDetails();
}

abstract class Vehicle implements Insurable {

    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate,
                   String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
        System.out.println("Rental Cost: " + calculateRentalCost(days));
        System.out.println("Insurance Cost: " + calculateInsurance());
        getInsuranceDetails();
    }
}

class Car extends Vehicle {

    public Car(String vehicleNumber, double rentalRate,
               String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: "
                + getInsurancePolicyNumber());
    }
}

class Bike extends Vehicle {

    public Bike(String vehicleNumber, double rentalRate,
                String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: "
                + getInsurancePolicyNumber());
    }
}

class Truck extends Vehicle {

    public Truck(String vehicleNumber, double rentalRate,
                 String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: "
                + getInsurancePolicyNumber());
    }
}

public class VehicleRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Car Vehicle Number:");
        String carNumber = input.nextLine();

        System.out.println("Enter Car Rental Rate Per Day:");
        double carRate = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Car Insurance Policy Number:");
        String carPolicy = input.nextLine();

        System.out.println("Enter Bike Vehicle Number:");
        String bikeNumber = input.nextLine();

        System.out.println("Enter Bike Rental Rate Per Day:");
        double bikeRate = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Bike Insurance Policy Number:");
        String bikePolicy = input.nextLine();

        System.out.println("Enter Truck Vehicle Number:");
        String truckNumber = input.nextLine();

        System.out.println("Enter Truck Rental Rate Per Day:");
        double truckRate = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Truck Insurance Policy Number:");
        String truckPolicy = input.nextLine();

        System.out.println("Enter Number of Rental Days:");
        int days = input.nextInt();

        Vehicle car = new Car(carNumber, carRate, carPolicy);
        Vehicle bike = new Bike(bikeNumber, bikeRate, bikePolicy);
        Vehicle truck = new Truck(truckNumber, truckRate, truckPolicy);

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = car;
        vehicles[1] = bike;
        vehicles[2] = truck;

        System.out.println("\nVehicle Rental Details");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println();
            vehicles[i].displayDetails(days);
        }

        input.close();
    }
}