package com.bridgelabz.java_csv;

import java.io.*;

public class Filter{
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.csv")
            );

            String line;

            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3].trim());

                if (marks > 80) {
                    System.out.println(
                            data[0] + " " +
                                    data[1] + " " +
                                    data[2] + " " +
                                    marks
                    );
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
