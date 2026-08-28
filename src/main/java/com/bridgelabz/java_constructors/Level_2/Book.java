package com.bridgelabz.java_constructors.Level_2;
/*
This program demonstrates access modifiers using a Book class.
ISBN is public, title is protected, and author is private.
The EBook subclass directly accesses ISBN and title, while public
getter and setter methods are used to access and modify the author.
*/

import java.util.Scanner;

public class Book {

    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ISBN:");
        String ISBN = input.nextLine();

        System.out.println("Enter book title:");
        String title = input.nextLine();

        System.out.println("Enter author name:");
        String author = input.nextLine();

        EBook ebook = new EBook(ISBN, title, author);

        ebook.displayDetails();

        System.out.println("Enter new author name:");
        String newAuthor = input.nextLine();

        ebook.setAuthor(newAuthor);

        System.out.println("Updated Author: " + ebook.getAuthor());

        input.close();
    }
}