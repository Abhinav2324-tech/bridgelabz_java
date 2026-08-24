package com.bridgelabz.java_constructors.Level_1;
/*
This program creates a Book class with title, author, and price.
It demonstrates both default and parameterized constructors
and displays the book details.
*/

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book book1 = new Book();

        System.out.println("Default Constructor Book Details:");
        book1.displayDetails();

        System.out.println("Enter book title:");
        String title = input.nextLine();

        System.out.println("Enter author name:");
        String author = input.nextLine();

        System.out.println("Enter book price:");
        double price = input.nextDouble();

        Book book2 = new Book(title, author, price);

        System.out.println("Parameterized Constructor Book Details:");
        book2.displayDetails();

        input.close();
    }
}