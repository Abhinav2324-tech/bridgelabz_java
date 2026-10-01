package com.bridgelabz.java_complexity;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeFileReadingPerformance {

    /*
     * Reads a text file using FileReader.
     *
     * FileReader is a character stream used
     * directly for reading text files.
     */
    public static long readUsingFileReader(String filePath) {

        long startTime = System.nanoTime();

        try (FileReader reader = new FileReader(filePath)) {

            char[] buffer = new char[8192];

            // Read multiple characters at once for better performance
            while (reader.read(buffer) != -1) {

                /*
                 * The data is simply read here.
                 * No processing is required for this experiment.
                 */
            }

        } catch (IOException e) {

            // Display an error if the file cannot be read
            System.out.println("FileReader Error: " + e.getMessage());
        }

        long endTime = System.nanoTime();

        // Return total execution time
        return endTime - startTime;
    }


    /*
     * Reads a text file using InputStreamReader.
     *
     * FileInputStream first reads bytes from the file.
     * InputStreamReader then converts those bytes
     * into characters.
     */
    public static long readUsingInputStreamReader(String filePath) {

        long startTime = System.nanoTime();

        /*
         * FileInputStream -> reads bytes
         * InputStreamReader -> converts bytes to characters
         */
        try (InputStreamReader reader =
                     new InputStreamReader(new FileInputStream(filePath))) {

            char[] buffer = new char[8192];

            // Read blocks of characters instead of one at a time
            while (reader.read(buffer) != -1) {

                /*
                 * The characters are only being read
                 * to measure file-reading performance.
                 */
            }

        } catch (IOException e) {

            // Handle file-related exceptions
            System.out.println(
                    "InputStreamReader Error: " + e.getMessage()
            );
        }

        long endTime = System.nanoTime();

        // Return total execution time
        return endTime - startTime;
    }


    /*
     * Compares the execution time of FileReader
     * and InputStreamReader for the same file.
     */
    public static void compareReaders(String filePath) {

        long fileReaderTime =
                readUsingFileReader(filePath);

        long inputStreamReaderTime =
                readUsingInputStreamReader(filePath);

        // Convert nanoseconds into milliseconds
        double fileReaderMs =
                fileReaderTime / 1_000_000.0;

        double inputStreamReaderMs =
                inputStreamReaderTime / 1_000_000.0;


        /*
         * Display the execution times
         * for both reading techniques.
         */
        System.out.println("File: " + filePath);

        System.out.println(
                "FileReader Time: "
                        + fileReaderMs + " ms"
        );

        System.out.println(
                "InputStreamReader Time: "
                        + inputStreamReaderMs + " ms"
        );
    }


    public static void main(String[] args) {

        /*
         * Replace the file paths below with
         * the actual locations of your files.
         */

        compareReaders("largeFile1MB.txt");

        compareReaders("largeFile100MB.txt");

        compareReaders("largeFile500MB.txt");
    }
}
