package com.bridgelabz.java_csv;
import java.io.*;

public class Read {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.csv")
            );

            String line;

            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("ID: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("Marks: " + data[3]);
                System.out.println("----------------");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}