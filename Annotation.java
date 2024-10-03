//annotation help to communicate with compiler with the problem and it helps like you can mention in B that its override and it will let you know if you c=have created any methods with same name which can be overridden(if name is biiiigg and you are unable to check yourself of course)
//there are other annotation inbuilt as well.
class A 
{
    public void showThedatawhichbelongstothisclass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void showThedatawhichbelongstothisclass(){
        System.out.println("In B show");
    }

}

public class Annotation
{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}
/*
 Annotations in Java are a form of metadata that provide additional information about the program. They are used to give instructions to the compiler or to be processed at runtime by various tools and frameworks. Annotations start with the @ symbol and can be applied to classes, methods, fields, parameters, and other program elements.
Key Features of Annotations
Metadata:
Annotations act as metadata, meaning they describe other data. They do not change the behavior of the program directly but can influence how the program is compiled or executed.
Syntax:
The basic syntax of an annotation is:
java
@AnnotationName

For example, @Override is an annotation that indicates a method is overriding a method in its superclass.
For example, @Override is an annotation that indicates a method is overriding a method in its superclass.
Types of Annotations:
Marker Annotations: These do not contain any elements. For example:
java
@Deprecated

Single-Value Annotations: These have one element, which can be specified like this:
java
@MyAnnotation("value")

Multi-Value Annotations: These can have multiple elements:
java
@MyAnnotation(name = "value", age = 30)

Built-in Annotations:
Java provides several built-in annotations, including:
@Override: Indicates that a method overrides a method in its superclass.
@Deprecated: Marks a method or class as outdated and suggests not using it.
@SuppressWarnings: Instructs the compiler to suppress specific warnings.
Custom Annotations:
You can create your own annotations using the @interface keyword. Here’s an example:
java
public @interface MyCustomAnnotation {
    String value();
    int number();
}

Usage in Code:
Annotations can be placed above classes, methods, fields, and even parameters. For example:
java
@MyCustomAnnotation(value = "example", number = 5)
public void myMethod() {
    // Method implementation
}

Processing Annotations:
Annotations can be processed at compile time or runtime. Tools and frameworks (like Spring and Hibernate) often use annotations to configure behavior without requiring XML configuration.
Retention Policy:
You can define how long annotations are retained using the @Retention annotation. It can be set to:
SOURCE: Discarded by the compiler.
CLASS: Retained in the class file but not available at runtime.
RUNTIME: Available at runtime for reflection.
Example of Using Annotations
Here’s a simple example demonstrating how to define and use a custom annotation:
java
// Define a custom annotation
public @interface Info {
    String author();
    String date();
}

// Use the custom annotation
@Info(author = "John Doe", date = "2024-10-03")
public class MyClass {
    // Class implementation
 */