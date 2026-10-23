package com.bridgelabz.java_designpatterns;
interface Coffee {
    String getDescription();
    int getCost();
}

class SimpleCoffee implements Coffee {

    public String getDescription() {
        return "Simple Coffee";
    }

    public int getCost() {
        return 50;
    }
}

class MilkDecorator implements Coffee {

    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    public int getCost() {
        return coffee.getCost() + 20;
    }
}

class SugarDecorator implements Coffee {

    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    public int getCost() {
        return coffee.getCost() + 10;
    }
}

public class Decorator {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}