//package Learning_Java;
class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("This toy's name is " + this.name);
    }
}

public class ThisKeyWrdbyAi {
    public static void main(String[] args) {
        Toy car = new Toy("Car");
        Toy plane = new Toy("Plane");

        car.printName();
        plane.printName();
    }
}
/*
In this example, we have a Toy class with a private variable name and two methods: a constructor that takes a name parameter, and a printName() method that prints the toy's name.
Inside the constructor, we use this.name to assign the name parameter to the name variable of the current object. This is because the name parameter has the same name as the name
variable, so this helps the computer know that we're talking about the variable inside the class, not the parameter.

In the printName() method, we use this.name again to access the name variable of the current object. This is not strictly necessary in this case, but it helps make it clear that
we're talking about the name variable of the current object, not a variable with the same name that might exist somewhere else.
When we create two Toy objects (car and plane) in the main() method and call their printName() methods, the this keyword helps the computer know which Toy object we're talking about.
The output will be:
text
This toy's name is Car
This toy's name is Plane

So, the this keyword is like a special name tag that helps the computer keep track of which object we're talking about, especially when we have multiple objects with similar names or properties.

*/
