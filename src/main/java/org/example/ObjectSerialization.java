package org.example;

import java.io.*;

class Person implements Serializable {                                      // The Person class must implement Serializable
    private static final long serialVersionUID = 1L;                        // Ensure class compatibility during serialization
    private String name;                                                    // Name attribute
    private int age;                                                        // Age attribute

    public Person(String name, int age) {                                   // Constructor to initialize the attributes
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {                                              // Override toString method for a meaningful printout of the object
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        String fileName = "src/main/resources/person.ser";                  // Specify the file name for serialization

        // Serialize the Person object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Person person = new Person("Deano", 30);                                    // Create an instance of Person
            oos.writeObject(person);                                                                // Serialize the object and write it to the file
            System.out.printf("Object serialized to file '%s'\n", fileName);                                       // Inform the user that the operation was successful
        } catch (IOException e) {
            e.printStackTrace();                                                                    // Handle any IOExceptions that may occur
        }

        // Deserialize the Person object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Person person = (Person) ois.readObject();                                              // Read and deserialize the object from the file
            System.out.println("Object deserialized from file: " + person);                         // Display the deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();                                                                    // Handle any IOExceptions and ClassNotFoundExceptions that may occur
        }
    }
}

