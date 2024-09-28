abstract class car{
    public abstract void drive();//when mention abstract it means I am just giving and abstract idea of the feature I do not know how it works though.
        //not sure what to put here then maybe declare it and not define
    //abstract method can only be in abstract class
    //cannot create an object of abstract class
    //any method can be created under abstract class but to use them they must be defined in the child class whose object we are creating .
    public void playmusic(){
        System.out.println("play music");
    }
}
//now the method that has been set as abstract must need to be in the child class with what it should do?
class Wagonr extends car{ //concrete class
    public void drive(){
        System.out.println("driving");
    }
}
public class abstractkeywrd {
    public static void main(String[] args) {
        car obj =new Wagonr(); //cant create object of abstract class hence for wagonr we created.
        obj.drive();
        obj.playmusic();
    }

}
