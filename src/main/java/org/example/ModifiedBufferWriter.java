package org.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ModifiedBufferWriter {
    public static void main(String[] args) {
        String fileName = "src/main/resources/output/modifiedtask3.txt";                       // Specifies the name of the file to write
        String data = "String for task 3";                                      // The string data to be written

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {           // Try-wit-resources to ensure FileOutputStream is closed automaitcally
            bos.write(data.getBytes());                                         // Converts the string to bytes and writes it to the file
            System.out.printf("Data written to file '%s'\n", fileName);         // Output to console to inform user the file was written successfully
        } catch (IOException e) {
            e.printStackTrace();                                                // Handle any IOExceptions
        }
    }
}
