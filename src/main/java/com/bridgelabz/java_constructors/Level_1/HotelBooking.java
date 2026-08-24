package com.bridgelabz.java_constructors.Level_1;
/*
This program creates a HotelBooking class with guest name,
room type, and number of nights. It demonstrates default,
parameterized, and copy constructors.
*/

import java.util.Scanner;

public class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HotelBooking booking1 = new HotelBooking();

        System.out.println("Default Booking:");
        booking1.displayDetails();

        System.out.println("Enter guest name:");
        String guestName = input.nextLine();

        System.out.println("Enter room type:");
        String roomType = input.nextLine();

        System.out.println("Enter number of nights:");
        int nights = input.nextInt();

        HotelBooking booking2 =
                new HotelBooking(guestName, roomType, nights);

        HotelBooking booking3 =
                new HotelBooking(booking2);

        System.out.println("Parameterized Booking:");
        booking2.displayDetails();

        System.out.println("Copied Booking:");
        booking3.displayDetails();

        input.close();
    }
}