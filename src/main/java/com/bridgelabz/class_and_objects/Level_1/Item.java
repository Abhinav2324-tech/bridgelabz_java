package com.bridgelabz.class_and_objects.Level_1;
import java.util.Scanner;

public class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("The item code is:"+itemCode);
        System.out.println("The item name is:"+itemName);
        System.out.println("The item price is:"+price);
    }
    public double calculateCost(int quantity){
        return quantity*price;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the item code:");
        int code=input.nextInt();
        input.nextLine();
        System.out.println("Enter the item name:");
        String name=input.nextLine();
        System.out.println("Enter the item price:");
        double price=input.nextDouble();
        System.out.println("Enter the item quantity:");
        int quantity=input.nextInt();
        Item item=new Item(code,name,price);
        item.displayDetails();
        System.out.println("The total cost is:"+item.calculateCost(quantity));
        input.close();
    }
}
