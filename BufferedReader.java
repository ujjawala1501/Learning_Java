/*
 User Input in Java
Java provides several ways to read user input, two of the most common being BufferedReader and Scanner. 
Each has its own advantages and use cases.
1. BufferedReader
Overview
BufferedReader is used for reading text from a character input stream efficiently. 
It reads larger blocks of characters at once, which can be more efficient than reading one character at a time.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
    public static void main(String[] args) {
        // Create a BufferedReader using InputStreamReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your name: ");
        try {
            // Read user input
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the reader
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}