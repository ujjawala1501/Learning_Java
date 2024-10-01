//enum by default have access to enum class
enum Laptop{ //class
    Macbook(2000),XPS(2200),Surface(15000) //objects

    private int price; //instance variab;e
    private Laptop(int price){ //constructor which takes the price
        this.price = price
    }
    
}


public class enumeration2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap);
    }
    
}
