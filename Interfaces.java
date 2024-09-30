/*abstract class A{ 
    public abstract void show();
    public abstract
}*/
//Instead of above we can use Interface
//interface is not a class and by default the methods in interface are public abstract
interface A{    //variables can also be declared in interfaces but every variable are by default final and static
   int age=44;
   String area = "pUNE";
    void show();
    void config();
}

class B implements A{ // when using implements you must define ALL the methods in parent interface
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
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
    }
    
}
