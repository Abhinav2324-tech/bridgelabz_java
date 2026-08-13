package com.bridgelabz.java_programming_element.Level_1;
/*
 * Program to calculate the volume of Earth
 * in cubic kilometers and cubic miles.
 * Formula: Volume = (4/3) * PI * radius^3
 */
public class Volume {
    public static void main(String[] args){
        double radiusKm=6378;
        double kmToMiles=1.6;//1 mile=1.6km
        double volumeKm=(4.0/3.0)*Math.PI*Math.pow(radiusKm,3);//Volume in KM
        double radiusMiles=radiusKm/kmToMiles;
        double volumeMiles=(4.0/3.0)*Math.PI*Math.pow(radiusMiles,3);//Volume in miles
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMiles);
    }
}
