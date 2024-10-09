// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Bank Account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: Available balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

// Main class
public class CustomException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.withdraw(150.0); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
/*
 Custom Exceptions in Java
Custom exceptions in Java allow developers to create their own exception types, which can be useful for handling specific error conditions in a more meaningful way. This enhances code readability and maintainability by providing clearer error messages related to the business logic.
Why Use Custom Exceptions?
Specificity: They allow you to catch and handle specific error conditions that are relevant to your application.
Clarity: Custom exceptions can provide more descriptive error messages, making it easier to understand what went wrong.
Business Logic: They can encapsulate business logic errors that may not be covered by standard exceptions.
Creating a Custom Exception
To create a custom exception in Java, you typically follow these steps:
Extend the Exception Class: Create a new class that extends the Exception class (or RuntimeException for unchecked exceptions).
Define Constructors: Implement constructors that allow you to pass error messages and other relevant information.
Example Code
Here’s a simple example of how to create and use a custom exception in Java:
java

// Step 1: Create a custom exception class
class InvalidAgeException extends Exception {
    // Constructor that takes a message
    public InvalidAgeException(String message) {
        super(message); // Call the parent constructor with the message
    }
}

// Step 2: Use the custom exception in your application
public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method that throws the custom exception if age is invalid
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older."); // Throwing the custom exception
        } else {
            System.out.println("Access granted.");
        }
    }
}

Explanation of the Code
Custom Exception Class:
InvalidAgeException extends Exception. It has a constructor that takes a string message and passes it to the superclass constructor using super(message).
Using the Custom Exception:
In the Main class, the checkAge method checks if the provided age is less than 18.
If it is, it throws an InvalidAgeException with a relevant message.
The main method calls checkAge within a try-catch block to handle the potential exception.
Catching the Exception:
When checkAge throws an exception, it is caught in the catch block, where you can handle it appropriately (e.g., logging or displaying an error message).
 */
