package com.bridgelabz.java_constructors.Level_2;
import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee=10000;
    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayDetails(){
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Vehicle Type:"+vehicleType);
        System.out.println("Registration Fee:"+registrationFee);
    }
    public static void updateRegistration(double newFee){
            registrationFee=newFee;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter owner 1 name:");
        String owner1=input.nextLine();
        System.out.println("Enter vehicle 1 type:");
        String type1=input.nextLine();
        Vehicle vehicle1=new Vehicle(owner1,type1);
        System.out.println("Enter owner 2 name:");
        String owner2=input.nextLine();
        System.out.println("Enter vehicle 2 type:");
        String type2=input.nextLine();
        Vehicle vehicle2=new Vehicle(owner2,type2);
        System.out.println("Update registration Fee:");
        double newFee=input.nextDouble();
        Vehicle.updateRegistration(newFee);
        vehicle1.displayDetails();
        vehicle2.displayDetails();
        input.close();
    }
}
