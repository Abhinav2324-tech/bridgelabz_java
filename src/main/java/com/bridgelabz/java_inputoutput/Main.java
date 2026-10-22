package com.bridgelabz.java_inputoutput;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("student.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
