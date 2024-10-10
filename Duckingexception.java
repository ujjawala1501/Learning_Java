public class Duckingexception {

    public static void main(String[] args) {
        // Example input
        Object input = "This is a string"; // Can be any object

        // Attempt to process the input
        try {
            processInput(input);
        } catch (ClassCastException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void processInput(Object obj) {
        // Attempting to cast the object
        String str = (String) obj; // This may throw ClassCastException
        System.out.println("Processed string: " + str);
    }
}
/*
 To duck exceptions using throws in Java, you can follow the principle of "Easier to Ask for Forgiveness than Permission" (EAFP). This involves attempting an operation and catching any exceptions that arise, rather than checking conditions beforehand. Here’s how to do it:
Understanding Duck Typing and Exception Handling
In Java, unlike Python's duck typing, you can't directly use duck typing because Java is statically typed. However, you can achieve similar behavior through exception handling. The idea is to try executing code that may throw an exception and handle it gracefully if it does.
 */
/*
 Explanation
Input Handling:
In the main method, we define an Object type variable that can hold any type of object.
Try-Catch Block:
We use a try-catch block to attempt processing the input. If the object is not of the expected type (e.g., not a String), a ClassCastException will be thrown.
Processing Method:
The processInput method tries to cast the input object to a String. If it fails, it throws an exception, which we catch in the main method.
Graceful Handling:
Instead of checking the type before casting (which is more cumbersome), we handle the potential failure gracefully with an exception.
 */