class Human {
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
        Human obj = new Human();
        
        // Below is how we are indirectly assigning values to private variables (through object)
        obj.setHeight(6);
        obj.setAddress("Bangalore");

        // Accessing values through getter methods
        System.out.println(obj.getName() + " : " + obj.getAge()); // This will access the values through methods
        System.out.println(obj.getHeight() + " : " + obj.getAddress()); // Accessing height and address
    }
}