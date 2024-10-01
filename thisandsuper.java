// Every constructor in java has a method even if you cant see it or mention it (super ) like john cena
//super = call the constructor of a super class
//this() in java is used to invoke the same class constructor and super() is used to to invoke superclass constructor.
class A{ //Suber class
    public A(){
        System.out.println("In A");

    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{   //Sub class
    public B(){ // This is a constructor
        System.out.println("In B");
    }
    public B(int n){//Parameterized constructor
        //point A//super(n); //now we get output as => In A Int In B int
        System.out.println("in B int ");
    }
}

public class ThisAndSuper{
    public static void main(String[] args){
        B obj = new B();//Output => In A In B //instantiated b class ,But whenever we create object of a class it will call both sub and super class.
    //  B obj = new B(n:5)//output=> In A  In B int (we are getting simple A and not the parameterized A because we need to give super in B a parameter. look at "point A"
    }
}