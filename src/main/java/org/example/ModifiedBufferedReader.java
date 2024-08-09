package org.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ModifiedBufferedReader {
    public static void main(String[] args) {
        String fileName = "src/main/resources/input/modifiedTask3.txt";                   // Name of file to be read

        try (BufferedInputStream bis = new BufferedInputStream( new FileInputStream(fileName))) {         // Try-with-resources to ensure that FileInputStream is closed automatically
            int byteData;

            while ((byteData = bis.read()) != -1) {                         //Read each byte from the file until the end is reached
                System.out.println((char) byteData);                        // Convert the byte to characters and print
            }
        }catch (IOException e) {
            e.printStackTrace();                                            // Handles any IOExceptions if they occur
        }

    }
}

