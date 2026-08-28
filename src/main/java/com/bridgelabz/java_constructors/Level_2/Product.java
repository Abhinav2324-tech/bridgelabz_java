package com.bridgelabz.java_constructors.Level_2;
import java.util.Scanner;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Name of the product is:"+productName);
        System.out.println("Price of the product is:"+price);
    }
    public static void displayTotalProducts(){
        System.out.println("Total products are:"+totalProducts);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter product 1 name:");
        String name1=input.nextLine();
        System.out.println("Enter product 1 price:");
        double price1=input.nextDouble();
        Product product1=new Product(name1,price1);
        input.nextLine();
        System.out.println("Enter product 2 name:");
        String name2=input.nextLine();

        System.out.println("Enter product 2 price:");
        double price2=input.nextDouble();
        Product product2=new Product(name2,price2);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
        input.close();
    }
}

