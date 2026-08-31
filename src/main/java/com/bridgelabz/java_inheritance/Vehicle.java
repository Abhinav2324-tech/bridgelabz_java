package com.bridgelabz.java_inheritance;
/*
This program demonstrates inheritance, method overriding, and polymorphism.
Vehicle is the parent class, while Car, Truck, and Motorcycle are subclasses.
Each subclass has its own unique attribute and overrides displayInfo().
The subclass objects are stored in a Vehicle array to demonstrate polymorphism.
*/

import java.util.Scanner;

class Vehicle {

    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {

    private int engineCapacity;

    public Motorcycle(int maxSpeed, String fuelType, int engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Car maximum speed:");
        int carSpeed = input.nextInt();
        input.nextLine();

        System.out.println("Enter Car fuel type:");
        String carFuel = input.nextLine();

        System.out.println("Enter Car seat capacity:");
        int seatCapacity = input.nextInt();

        System.out.println("Enter Truck maximum speed:");
        int truckSpeed = input.nextInt();
        input.nextLine();

        System.out.println("Enter Truck fuel type:");
        String truckFuel = input.nextLine();

        System.out.println("Enter Truck load capacity:");
        double loadCapacity = input.nextDouble();

        System.out.println("Enter Motorcycle maximum speed:");
        int motorcycleSpeed = input.nextInt();
        input.nextLine();

        System.out.println("Enter Motorcycle fuel type:");
        String motorcycleFuel = input.nextLine();

        System.out.println("Enter Motorcycle engine capacity:");
        int engineCapacity = input.nextInt();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(carSpeed, carFuel, seatCapacity);
        vehicles[1] = new Truck(truckSpeed, truckFuel, loadCapacity);
        vehicles[2] = new Motorcycle(motorcycleSpeed, motorcycleFuel, engineCapacity);

        System.out.println("\nVehicle Details:");

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println();
        }

        input.close();
    }
}