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
/*
 Key Points
Efficiency: BufferedReader is generally faster for reading large amounts of text.
Methods: The readLine() method reads an entire line of text.
 */
/*

 2. Scanner
Overview
Scanner is a simple way to read input from various sources like keyboard input, files, etc. It can parse primitive types and strings using regular expressions.
Example of Using Scanner
java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from System.in
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        // Read an integer from user input
        int age = scanner.nextInt();
        
        System.out.println("You are " + age + " years old.");
        
        // Close the scanner
        scanner.close();
    }
}
Key Points
Flexibility: Scanner can parse different types of inputs (e.g., integers, doubles).
Methods: Common methods include nextInt(), nextLine(), and nextDouble().
Comparison Between BufferedReader and Scanner
Feature	BufferedReader	Scanner
Primary Use	Reading text efficiently	Parsing primitive types
Performance	Generally faster for large inputs	Slower due to parsing capabilities
Input Types	Text only	Text, integers, doubles, etc.
Line Reading	Uses readLine() method	Uses nextLine() method
Conclusion
Use BufferedReader when you need to read large amounts of text quickly.
 */