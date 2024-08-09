package org.example;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteByByteWriter {
    public static void main(String[] args) {
        String fileName = "src/main/resources/task2.txt";                       // Specifies the name of the file to write
        String data = "String for task 2";                                      // The string data to be written

        try (FileOutputStream fos = new FileOutputStream(fileName)) {           // Try-wit-resources to ensure FileOutputStream is closed automaitcally
            fos.write(data.getBytes());                                         // Converts the string to bytes and writes it to the file
            System.out.printf("Data written to file '%s'\n", fileName);         // Output to console to inform user the file was written successfully
        } catch (IOException e) {
            e.printStackTrace();                                                // Handle any IOExceptions
        }
    }
}
