package com.bridgelabz.java_csv;

import java.io.*;

public class Count {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.csv")
            );

            String line;
            int count = 0;

            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            br.close();

            System.out.println("Total records: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
