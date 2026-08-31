package com.bridgelabz.java_abstraction;
import java.util.Scanner;

interface Discountable{
    double applyDiscount();
    void getDiscountDetails();
}
abstract class FoodItem implements Discountable{
    private String itemName;
    private int quantity;
    private double price;
    FoodItem(String itemName,int quantity,double price){
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(){
        this.itemName=itemName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item name: "+itemName);
        System.out.println("Item quantity: "+quantity);
        System.out.println("Item price: "+price);
        System.out.println("Total price: "+calculateTotalPrice());
        System.out.println("Price after discount: "+applyDiscount());
        getDiscountDetails();
    }
}
class VegItem extends FoodItem{
    VegItem(String itemName,int quantity,double price){
        super(itemName, quantity, price);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity()*getPrice();
    }

    @Override
    public double applyDiscount() {
        double totalPrice=calculateTotalPrice();
        return totalPrice-(totalPrice*0.05);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount offered: 5%");
    }
}
class NonVegItem extends FoodItem{
    NonVegItem(String itemName,int quantity,double price){
        super(itemName, quantity, price);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice=getQuantity()*getPrice();
        return totalPrice + (totalPrice*0.10);
    }

    @Override
    public double applyDiscount() {
        double totalPrice=calculateTotalPrice();
        return totalPrice-(totalPrice*0.05);
    }
    public void getDiscountDetails() {
        System.out.println("Discount offered: 5%");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter veg item name:");
        String vegName=input.nextLine();
        System.out.println("Enter veg item quantity:");
        int vegQuantity=input.nextInt();
        input.nextLine();
        System.out.println("Enter veg item price:");
        double vegPrice=input.nextDouble();
        input.nextLine();
        System.out.println("Enter non veg item name:");
        String nonVegName=input.nextLine();
        System.out.println("Enter non veg item quantity:");
        int nonVegQuantity=input.nextInt();
        input.nextLine();
        System.out.println("Enter non veg item price:");
        double nonVegPrice=input.nextDouble();
        input.nextLine();
        FoodItem vegItem=new VegItem(vegName,vegQuantity,vegPrice);
        FoodItem nonVegItem=new NonVegItem(nonVegName,nonVegQuantity,nonVegPrice);

        FoodItem[] item=new FoodItem[2];
        item[0]=vegItem;
        item[1]=nonVegItem;
        System.out.println("\nItem details:");
            for(int i=0;i< item.length;i++){
                item[i].getItemDetails();
                System.out.println();
        }
            input.close();
    }
}