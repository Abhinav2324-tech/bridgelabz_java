package com.bridgelabz.java_inheritance;
import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animals make Sounds.");
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Dog extends Animal{
    Dog(String name,int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Dog says:Bow!Bow!");
    }
}
class Cat extends Animal{
    Cat(String name,int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Cat says:Meow!Meow!");
    }
}
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Bird says:Chirp!Chirp!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dog name:");
        String dogName= input.nextLine();
        System.out.println("Enter dog age:");
        int dogAge=input.nextInt();
        input.nextLine();
        System.out.println("Enter cat name:");
        String catName=input.nextLine();
        System.out.println("Enter cat age:");
        int catAge=input.nextInt();
        input.nextLine();
        System.out.println("Enter bird name:");
        String birdName=input.nextLine();
        System.out.println("Enter bird age:");
        int birdAge=input.nextInt();
        input.nextLine();
        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);
        Animal bird = new Bird(birdName, birdAge);
        dog.displayDetails();
        dog.makeSound();
        cat.displayDetails();
        cat.makeSound();
        bird.displayDetails();
        bird.makeSound();
        input.close();
    }
}

