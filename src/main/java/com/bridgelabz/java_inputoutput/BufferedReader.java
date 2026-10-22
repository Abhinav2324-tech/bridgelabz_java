package com.bridgelabz.java_inputoutput;

import java.io.*;

public class BufferedReader {
    public BufferedReader(FileReader fileReader) {

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("student.txt")
        );

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    private void close() {

    }

    private String readLine() {
            return null;
    }
}
