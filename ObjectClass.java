//every time an "object" is printed it calles "tostring" method.
class Laptop{
     String model;
    int price;
}
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj =new Laptop();
        obj.model = "Lenovo thinkpad";
        obj.price = 1000;

        System.out.println(obj); 
    }
}
/*
 
What is the Object Class?
In Java, the Object class is like a big box that holds all the other classes. It's the most basic class in Java, and every other class you create is like a smaller box inside this big box.
When you create a new class, it automatically becomes a part of the Object class. This means that your class can use all the special features and abilities that the Object class has.
The toString() Method
One of the special abilities that the Object class has is the toString() method. This method is like a magic wand that can turn an object into a string (a bunch of letters and numbers).
Imagine you have a dog named Buddy. The Object class can take Buddy and turn him into a string that says "Buddy" or something like that. This is really useful when you want to print out information about an object.
How to Use toString()
Let's say you have a class called Dog that has a name and age. When you create a Dog object and try to print it out, Java will automatically use the toString() method from the Object class to turn the Dog object into a string.
java
class Dog {
    String name;
    int age;
}

Dog myDog = new Dog();
myDog.name = "Buddy";
myDog.age = 5;

System.out.println(myDog);

Output:
text
Dog@7c30a502

As you can see, the default toString() method from the Object class just prints out the class name and a weird number. This is not very helpful.
To make it more useful, you can override the toString() method in your Dog class to return a custom string with the dog's name and age.
java
class Dog {
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog name: " + name + ", age: " + age;
    }
}

Dog myDog = new Dog();
myDog.name = "Buddy";
myDog.age = 5;

System.out.println(myDog);

Output:
text
Dog name: Buddy, age: 5

Now, when you print out the Dog object, it will show the custom string you defined in the toString() method.
Conclusion
The Object class is the most basic class in Java, and every other class you create is a part of it. The toString() method is a special ability of the Object class that can turn an object into a string. By overriding the toString() method in your own classes, you can customize how objects are printed out, making it easier to understand and debug your code.
 */