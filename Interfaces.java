/*abstract class A{ 
    public abstract void show();
    public abstract
}*/
//Inheritance keywords
//CLASS - Class -> extends
//CLASS - interfaces -> implements
//interface - interface -> extends 
//Instead of above we can use Interface
//interface is not a class and by default the methods in interface are public abstract
interface A{    //variables can also be declared in interfaces but every variable are by default final and static
   int age=44;
   String area = "pUNE";
    void show();
    void config();
}
interface C {
    void run();

}
interface D extends C{ //inheritance is valid in interfaces.

}

class B implements A,C{ // when using implements you must define ALL the methods in parent interface
   //One class can implement multiple Interfaces we just need to define every method in every interface in the class thats implementing  
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }

}

public class Interfaces {
    public static void main(String[] args){
        A obj ;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        //A.area = "Hyderabad" //cannot change the value because its final by default
        
        C obj1 = new B();
        obj1.run();    
    }
    
}
/*
 Types of Interfaces :
    1)Normal interface >interface have two or more methods
    2)Functional interface/SAM >(Single Abstract Method) it has only one method in it 
    3)Marker interface > interface which has no methods (just to update the compiler )
 */
