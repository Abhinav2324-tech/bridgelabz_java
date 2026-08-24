package com.bridgelabz.java_constructors.Level_1;
import java.util.Scanner;

public class BorrowBook {

    private String title;
    private String author;
    private double price;
    private boolean availability;

    public BorrowBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {

        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = input.nextLine();

        System.out.println("Enter author name:");
        String author = input.nextLine();

        System.out.println("Enter book price:");
        double price = input.nextDouble();

        System.out.println("Is the book available? Enter true or false:");
        boolean availability = input.nextBoolean();

        BorrowBook book = new BorrowBook(title, author, price, availability);

        book.displayDetails();

        book.borrowBook();

        System.out.println("After borrowing:");
        book.displayDetails();

        input.close();
    }
}