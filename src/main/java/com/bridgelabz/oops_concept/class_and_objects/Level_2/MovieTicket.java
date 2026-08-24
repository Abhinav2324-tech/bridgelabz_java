package com.bridgelabz.oops_concept.class_and_objects.Level_2;
/*
This program creates a MovieTicket class with movie name,
seat number, and price. It allows the user to book a ticket
by assigning a seat and price and then displays the ticket details.
*/

import java.util.Scanner;

public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter movie name:");
        String movieName = input.nextLine();

        System.out.println("Enter seat number:");
        String seatNumber = input.nextLine();

        System.out.println("Enter ticket price:");
        double price = input.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName);

        ticket.bookTicket(seatNumber, price);

        ticket.displayDetails();

        input.close();
    }
}
