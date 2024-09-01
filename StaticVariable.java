//A static variable is common for all the objects 
//Static variable should be accessed using the class name instead of object we create for the class.
//there is different area in jvm for static variable
//Static keyword mean we are making something as a class member not an object member
//static variable saves memory as every object doesnt consumes memory and only class can be used.
//if we change the static variable u
class Mobile {
    String brand ;
    int price;    
    static String name;

    public void show(){
        System.out.println(brand + price + name);
    }
}

class StaticVariable{
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        m1.brand = "apple";
        m1.price = 15000;
        Mobile.name="Iphone"; //assigning using class name and not object because its static variable.
   
        Mobile m2 =new Mobile();
        m2.brand = "Samsung";
        m2.price = 30000;
        m2.name = "Android";
    }

}
