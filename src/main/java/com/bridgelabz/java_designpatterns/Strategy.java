package com.bridgelabz.java_designpatterns;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Context
class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1000);

        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(500);
    }
}