/*
 Types of Errors:
 1)compile time error > we are shown at compiling time.

 2) Runtime Error > code is working smoothly ,no compile time error but suddenly the code STOPSS!!  (this is where exception handling comes which means to handle the pre assumed errors)(example . > arrayoutofbound ,arithmeticexception etc)

 3) Logical error > when output is wrong(you fucked up!)now you need to test everything EVERY DAMN THING !
 
 We can have multiple try ,catch executes only when there is some error otherwise it will pass.
 */
//Some exceptions which we are not sure of ->catch(Exception e) //Exception is a parent class it can handle any exception .
public class Exceptions {
    public static void main(String[] args){
        int i = 9;
        int j = 0;
        try //try to execute this statemenent ,if there is an error continue the next code but throw the error from here to exception class and I as a dev will catch it 
        {
         j = 18/i; //this is critical ,what if value of i is 0?(youll get arithmetic exception)and this will stop the execution
        }
        catch(ArrayIndexOutOfBoundsException e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        catch(ArithmeticException e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        catch(Exception e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        System.out.println(j);
    }
    
}
/*which exceptions are important to handle 
 Errors are something we cant handle.
 runtime Exceptions such as Arithmatic ,ArrayIndexOutOfBound,Null pointer ,for SQL exception IOException these we can handle whereas SQLException areChecked exceptions and Runtime exceptions are called Unchecked Exception
 */
/*throw
Purpose: Used to explicitly throw an exception from a method or a block of code.
Usage: You can throw either a checked or unchecked exception.
Example:
java
Copy code
public class Example {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
throws
Purpose: Used in a method signature to declare that a method may throw one or more exceptions.
Usage: Typically used for checked exceptions, indicating that the caller of the method is responsible for handling the exception.
Example:
java
Copy code
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // Read file content
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
Key Differences
Context:

throw: Used to actually throw an exception.
throws: Declares that a method might throw an exception.
Location:

throw: Can be used anywhere in the code.
throws: Must be used in the method signature.
Exceptions:

throw: Can throw both checked and unchecked exceptions.
throws: Typically used for checked exceptions, but can also declare unchecked exceptions. 
Types of Exceptions
Checked Exceptions:
Also known as compile-time exceptions.
These must be either caught or declared in the method signature using the throws keyword.
Examples include:
SQLException
ClassNotFoundException
Unchecked Exceptions:
Also known as runtime exceptions.
These do not need to be explicitly handled or declared.
Examples include:
NullPointerException
IllegalArgumentException
ArithmeticException*/