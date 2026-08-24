package com.bridgelabz.class_and_objects.Level_1;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("The title of the books is:"+title);
        System.out.println("The author of the book is:"+author);
        System.out.println("The price of the book is:"+price);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String title=input.nextLine();
        System.out.println("Enter the author of the book:");
        String author=input.nextLine();
        System.out.println("Enter the price of the book:");
        double price=input.nextDouble();
        Book book=new Book(title,author,price);
        book.displayDetails();
        input.close();
    }
}
