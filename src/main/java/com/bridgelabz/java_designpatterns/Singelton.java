package com.bridgelabz.java_designpatterns;
class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
        System.out.println("Object created");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void display() {
        System.out.println("Singleton method called");
    }
}

public class Singelton {
    public static void main(String[] args) {

        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();

        obj1.display();

        System.out.println(obj1 == obj2);
    }
}