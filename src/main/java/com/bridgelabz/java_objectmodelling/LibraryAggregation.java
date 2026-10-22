package com.bridgelabz.java_objectmodelling;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Library: " + name);

        for (Book book : books) {
            book.display();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");
        Book b3 = new Book("DSA", "Robert");

        Library l1 = new Library("Central Library");
        Library l2 = new Library("City Library");

        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b2);
        l2.addBook(b3);

        l1.displayBooks();
        l2.displayBooks();
    }
}