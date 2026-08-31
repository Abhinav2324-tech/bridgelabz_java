package com.bridgelabz.java_abstraction;
/*
This program demonstrates a Library Management System using
abstraction, inheritance, encapsulation, interfaces, method overriding,
and polymorphism. Book, Magazine, and DVD have different loan durations,
and all items can be reserved and checked for availability.
*/

import java.util.Scanner;

interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {

    private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean available;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + checkAvailability());
    }
}

class Book extends LibraryItem {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book ID:");
        int bookId = input.nextInt();
        input.nextLine();

        System.out.println("Enter Book Title:");
        String bookTitle = input.nextLine();

        System.out.println("Enter Book Author:");
        String bookAuthor = input.nextLine();

        System.out.println("Enter Magazine ID:");
        int magazineId = input.nextInt();
        input.nextLine();

        System.out.println("Enter Magazine Title:");
        String magazineTitle = input.nextLine();

        System.out.println("Enter Magazine Author:");
        String magazineAuthor = input.nextLine();

        System.out.println("Enter DVD ID:");
        int dvdId = input.nextInt();
        input.nextLine();

        System.out.println("Enter DVD Title:");
        String dvdTitle = input.nextLine();

        System.out.println("Enter DVD Author:");
        String dvdAuthor = input.nextLine();

        System.out.println("Enter Borrower Name:");
        String borrowerName = input.nextLine();

        LibraryItem book =
                new Book(bookId, bookTitle, bookAuthor);

        LibraryItem magazine =
                new Magazine(magazineId, magazineTitle, magazineAuthor);

        LibraryItem dvd =
                new DVD(dvdId, dvdTitle, dvdAuthor);

        LibraryItem[] items = new LibraryItem[3];

        items[0] = book;
        items[1] = magazine;
        items[2] = dvd;

        System.out.println("\nLibrary Item Details");

        for (int i = 0; i < items.length; i++) {
            System.out.println();
            items[i].getItemDetails();
            items[i].reserveItem(borrowerName);
        }

        input.close();
    }
}