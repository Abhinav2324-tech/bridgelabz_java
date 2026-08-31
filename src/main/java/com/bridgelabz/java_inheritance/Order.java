package com.bridgelabz.java_inheritance;
/*
This program demonstrates multilevel inheritance using an Order system.
Order is the base class, ShippedOrder extends Order, and DeliveredOrder
extends ShippedOrder. Each level adds its own attribute and overrides
getOrderStatus() to return the current status of the order.
*/

import java.util.Scanner;

class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Order ID:");
        int orderId = input.nextInt();
        input.nextLine();

        System.out.println("Enter Order Date:");
        String orderDate = input.nextLine();

        System.out.println("Enter Tracking Number:");
        String trackingNumber = input.nextLine();

        System.out.println("Enter Delivery Date:");
        String deliveryDate = input.nextLine();

        Order order =
                new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);

        System.out.println("\nOrder Details:");
        order.displayInfo();

        System.out.println("Order Status: " + order.getOrderStatus());

        input.close();
    }
}