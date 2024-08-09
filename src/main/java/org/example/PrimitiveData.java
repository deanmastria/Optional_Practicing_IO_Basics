package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveData {
    public static void main(String[] args) {
        String fileName = "src/main/resources/input/primitiveData.bin";                               //bin to store binary data

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {     // Write data to file using dataoutputstream
            dos.writeInt(456);          //int value
            dos.writeFloat(60.60f);                     //float value
            dos.writeBoolean(true);               // Boolean value
            dos.writeChar('Z');                  // Char value
            System.out.printf("Primitive Data Written '%s'\n", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream( new FileInputStream(fileName))) {       // Read data from file using DataInputStream
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            boolean boolValue = dis.readBoolean();
            char charValue = dis.readChar();

            System.out.println("Primitive Data Read: " + intValue + " " + floatValue + " " + boolValue + " " + charValue);
        } catch (IOException e) {
            e.printStackTrace();  // Handle any IOExceptions that may occur
        }

    }
}
