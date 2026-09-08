package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;

/*
 * Program to take travel details as user input
 * and calculate the total distance and total travel time
 * from the starting city to the final city via another city.
 */
public class Travel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = input.nextLine();

        System.out.println("Enter the from city:");
        String fromCity = input.nextLine();

        System.out.println("Enter the via city:");
        String viaCity = input.nextLine();

        System.out.println("Enter the final city:");
        String toCity = input.nextLine();

        System.out.println("Enter distance from " + fromCity + " to " + viaCity + ":");
        double distanceFromToVia = input.nextDouble();

        System.out.println("Enter hours from " + fromCity + " to " + viaCity + ":");
        int hoursFromToVia = input.nextInt();

        System.out.println("Enter minutes from " + fromCity + " to " + viaCity + ":");
        int minutesFromToVia = input.nextInt();

        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;

        System.out.println("Enter distance from " + viaCity + " to " + toCity + ":");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.println("Enter hours from " + viaCity + " to " + toCity + ":");
        int hoursViaToFinalCity = input.nextInt();

        System.out.println("Enter minutes from " + viaCity + " to " + toCity + ":");
        int minutesViaToFinalCity = input.nextInt();

        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}