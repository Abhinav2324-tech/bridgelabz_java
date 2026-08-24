package com.bridgelabz.java_constructors.Level_1;
/*
This program creates a Person class with name and age.
It uses a parameterized constructor to create one person
and a copy constructor to clone the person's attributes.
*/

import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter person name:");
        String name = input.nextLine();

        System.out.println("Enter person age:");
        int age = input.nextInt();

        Person person1 = new Person(name, age);

        Person person2 = new Person(person1);

        System.out.println("Original Person:");
        person1.displayDetails();

        System.out.println("Copied Person:");
        person2.displayDetails();

        input.close();
    }
}