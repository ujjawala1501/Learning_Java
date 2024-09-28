
//EXAMPLE 1
/*class A{
    int age;
    public void show(){
        System.out.println("in class A show method");

    }
    class B{
        public void config(){
            System.out.println("in class B inside class A in config");
        }
    }
}

public class Innerclass {
    Public static void main(String[] args){
            A obj = new A();
            obj.show;

            A.B obj1 = obj.new B(); //A.B => B is under A now to get to B we use object of A we created previously.
            obj1.config(); 
    }

} */

//EXAMPLE 2
class A{
    public void show(){
        System.out.println("In a show");
    }
}
public class Innerclass{
    public static void main(String[] args){
        A obj = new A() 
        //this can be used to make changes in abstract method of abstract class as well ,remember that abstract class can contain normal methods as well as abstract methods.
        { //class starts from here and note that the semicolon which was supposed to be at the end of above equation is not there and its at the end of curly braces.
            public void show(){ //this is under anonymous class and this can be done for multiple methods if we want to override operations
                System.out.println("in main method class Innerclass"); //we are changing the value for show method in A class,this is overriding of the method aaand this is INNERCLASS as class is not defined but we are changing the value inside class Innerclass. 
            } 
        };
        obj.show();
    }
}

