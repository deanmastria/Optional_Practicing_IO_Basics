package org.example;

import java.io.*;

public class UpperCaseConverter {
    public static void main(String[] args) {
        String inputFileName = "src/main/resources/input/task1.txt";                                  //Specifies the input file
        String outputFileName = "src/main/resources/output/upperCase.txt";                            // Specifies the output file

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(inputFileName));         // Use try-with-resources to ensure both streams are closed automatically
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outputFileName))) {

            int charData;

            while ((charData = isr.read()) != -1) {                                             // Read each character, convert to uppercase, and write to the output file
                osw.write(Character.toUpperCase((char) charData));                              // Convert character to uppercase and write to file
            }
            System.out.printf("Data has been converted to upper case and written to file '%s'\n", outputFileName);    // Inform the user that the operation was successful
        } catch (IOException e) {
            e.printStackTrace();                                                                // Handle any IOExceptions that may occur
        }

    }
}

