package com.bridgelabz.java_json;
class Car {

    public String brand;
    public String model;
    public int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Car car = new Car("Toyota", "Innova", 2500000);

        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}