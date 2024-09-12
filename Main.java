// Create a Main class

  /*the constructor name must match the class name, and it cannot have a return type (like void).

the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
However, then you are not able to set initial values for object attributes. */
class Main {
    int x;  // Create a class attribute
    int age;
    String name;
    // Create a class constructor for the Main class
    public Main() {
      x = 5;  // Set the initial value for the class attribute x

    }
    public Main(int a,String n){ //Parameterized Constructor
      this.age = a;
      this.name = n;
    }
    public static void constructor(String[] args) {
      Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }
  
<<<<<<< HEAD
  // Outputs 5
=======
  // Outputs 5
  /*the constructor name must match the class name, and it cannot have a return type (like void).

the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
However, then you are not able to set initial values for object attributes.

Answer by AI
Imagine you have a toy car factory. Every time you want a new toy car, you tell the factory what color and size you want.
 The factory uses this information to create the toy car. In Java, the factory uses a constructor to set up the new toy car.
  Each car has its own special notebook (this) to remember its details.

  // This is our toy car factory in Java!
class ToyCar {
    // These are the details for each toy car
    private String color;
    private String size;

    // Constructor is like the instruction manual
    public ToyCar(String color, String size) {
        this.color = color;  // `this` is the special notebook where we write the color
        this.size = size;    // `this` is the special notebook where we write the size
    }

    // This method shows what the car looks like
    public void showCar() {
        System.out.println("This is a " + size + " toy car and it's " + color + "!");
    }

    public static void main(String[] args) {
        // Now we use the factory to make a toy car
        ToyCar myCar = new ToyCar("red", "small");

        // Let's see our car
        myCar.showCar();
    }
}

*/
>>>>>>> 4fa3f62cb866cd86e89fce79f2e71f8951a26ca2
