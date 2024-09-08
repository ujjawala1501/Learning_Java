//we can name get and set any thing we want like "xyz" or"ffgh" but that will create confusion while reading so use get while getting the value and set while setting the value
package Learning_Java;
class Human2 {
    // Private variables
    private int age = 11; // accessible only in the same class
    private String name = "Laxmi";
    
    // Additional private variables
    private int height; 
    private String address; 

    // Getter for age
    public int getAge() { 
        return age; // this will fetch the value as it's in the same class
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for height
    public void setHeight(int a) {
        height = a;
    }

    // Setter for address
    public void setAddress(String n) {
        address = n; // Corrected to assign to address
    }

    // Getter for height
    public int getHeight() {
        return height; // this will fetch the value as it's in the same class
    }

    // Getter for address
    public String getAddress() {
        return address;
    }
}

public class EncapsulationbyAi {
    public static void main(String[] args) {
        Human2 obj = new Human2();
        
        // Below is how we are indirectly assigning values to private variables (through object)
        obj.setHeight(6);
        obj.setAddress("Bangalore");

        // Accessing values through getter methods
        System.out.println(obj.getName() + " : " + obj.getAge()); // This will access the values through methods
        System.out.println(obj.getHeight() + " : " + obj.getAddress()); // Accessing height and address
    }
}

/*
Hiding the secret:
Encapsulation allows you to hide the internal details of a class.
By making the class members private, you can prevent direct access to the data.

Flexibility and changes:
Encapsulated code is more flexible and easier to change with new requirements.
You can change the internal implementation of a class without affecting the code that uses the class.

Easier testing and debugging:
Encapsulation makes unit testing easier because each class can be tested independently.
It helps in debugging because you can easily identify the source of an error within the class.

Reducing dependencies:
Encapsulation reduces dependencies between classes by hiding the internal implementation details.
It groups related data and methods together within a class.

Abstraction and encapsulation:
Abstraction focuses on the external behavior of an object, while encapsulation focuses on the internal implementation details.
Abstraction is achieved through interfaces and abstract classes, while encapsulation is achieved through access modifiers and getter/setter methods.
*/