package com.bridgelabz.java_keywords.Level_1;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private final String isbn;
    private static String libraryName="Central Library";
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void displayLibraryName(){
        System.out.println("Library Name:"+libraryName);
    }
    public void displayDetails(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("ISBN:"+isbn);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String title=input.nextLine();
        System.out.println("Enter the author of the book:");
        String author=input.nextLine();
        System.out.println("Enter the isbn:");
        String isbn=input.nextLine();
        Book book=new Book(title,author,isbn);
        Book.displayLibraryName();
        if(book instanceof Book){
            book.displayDetails();
        }
        input.close();
    }
}
