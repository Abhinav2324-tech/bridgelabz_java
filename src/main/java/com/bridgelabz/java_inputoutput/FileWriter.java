package com.bridgelabz.java_inputoutput;

import java.io.*;

public class FileWriter {
    public FileWriter(String file) {

    }

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("student.txt");

        fw.write("Name: Rahul\n");
        fw.write("Age: 21\n");
        fw.write("Marks: 95\n");

        fw.close();

        System.out.println("Data written successfully");
    }

    private void close() {

    }

    private void write(String s) {

    }
}
