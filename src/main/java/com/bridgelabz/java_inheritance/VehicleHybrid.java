package com.bridgelabz.java_inheritance;
import java.util.Scanner;

class VehicleHybrid {
    protected int maxSpeed;
    protected String model;
    public VehicleHybrid(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public void displayDetails(){
        System.out.println("Max Speed is: "+maxSpeed);
        System.out.println("Model is: "+model);
    }
}
class ElectricVehicle extends VehicleHybrid{
    ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("Electric vehicle is charging.");
    }
}
interface Refuelable{
    void refuel();
}
class PetrolVehicle extends VehicleHybrid implements Refuelable{
    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("Petrol vehicle is refueling.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter electric vehicle model:");
        String evModel=input.nextLine();
        System.out.println("Enter electric vehicle max speed:");
        int evSpeed=input.nextInt();
        input.nextLine();
        System.out.println("Enter petrol vehicle model:");
        String petrolModel=input.nextLine();
        System.out.println("Enter petrol vehicle max speed:");
        int petrolSpeed=input.nextInt();
        ElectricVehicle electricVehicle=new ElectricVehicle(evSpeed,evModel);
        PetrolVehicle petrolVehicle=new PetrolVehicle(petrolSpeed,petrolModel);
        System.out.println("\nElectric vehicle details:");
        electricVehicle.displayDetails();
        electricVehicle.charge();

        System.out.println("\nPetrol vehicle details:");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
        input.close();
    }
}
