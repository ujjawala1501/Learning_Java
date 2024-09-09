package Learning_Java;

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
//There are two ways to overload the method in java
//By changing number of arguments
//By changing the data type
// Base class
class Animal {
    void makeSound() {
        // Default sound
        System.out.println("Some sound");
    }
}

// Dog class that extends Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Cat class that extends Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Dog object
        Animal myCat = new Cat(); // Cat object

        // Calling the same method on different objects
        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow
    }
}