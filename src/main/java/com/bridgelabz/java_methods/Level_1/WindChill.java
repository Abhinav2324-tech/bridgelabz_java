package com.bridgelabz.java_methods.Level_1;
import java.util.Scanner;
/*
 * This program calculates the wind chill temperature.
 * It takes the temperature and wind speed as input from the user.
 * It creates an object and calls a method to calculate the wind chill.
 * Finally, it displays the calculated wind chill temperature.
 */
public class WindChill {

    public double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temperature = input.nextDouble();

        System.out.println("Enter wind speed:");
        double windSpeed = input.nextDouble();

        WindChill obj = new WindChill();

        double windChill = obj.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature = " + windChill);

        input.close();
    }
}