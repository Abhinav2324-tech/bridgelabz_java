package com.bridgelabz.java_csv;
import java.io.*;

public class Write{
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("employees.csv")
            );

            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            bw.write("101,Rahul,IT,50000");
            bw.newLine();

            bw.write("102,Priya,HR,45000");
            bw.newLine();

            bw.write("103,Amit,Finance,60000");
            bw.newLine();

            bw.write("104,Sneha,IT,55000");
            bw.newLine();

            bw.write("105,Kiran,Marketing,40000");
            bw.newLine();

            bw.close();

            System.out.println("CSV file created successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
