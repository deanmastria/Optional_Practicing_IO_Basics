package org.example;

import java.io.IOException;
import java.io.FileInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ByteByByteReader {
    public static void main(String[] args) {
        String fileName = "src/main/resources/input/task1.txt";                   // Name of file to be read

        try (FileInputStream fis = new FileInputStream(fileName)) {         // Try-with-resources to ensure that FileInputStream is closed automatically
            int byteData;

            while ((byteData = fis.read()) != -1) {                         //Read each byte from the file until the end is reached
                System.out.println((char) byteData);                        // Convert the byte to characters and print
            }
        }catch (IOException e) {
            e.printStackTrace();                                            // Handles any IOExceptions if they occur
        }

    }
}