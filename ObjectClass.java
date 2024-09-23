//every time an "object" is printed it calles two string method.
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
