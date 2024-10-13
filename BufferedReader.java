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