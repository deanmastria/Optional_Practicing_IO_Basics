package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseOrder {
    public static void main(String[] args) {
    String inputFileName = "src/main/resources/input/task1.txt";
    String outputFileName = "src/main/resources/output/reverseOrder.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
         BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {


        List<String> lines = new ArrayList<>();                                         // Create a list to hold the lines of text
        String line;

        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        Collections.reverse(lines);

        for (String reversedLine : lines) {
            writer.write(reversedLine);
            writer.newLine();
        }

        System.out.printf("File content reversed and written to file '%s'\n", outputFileName);

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
