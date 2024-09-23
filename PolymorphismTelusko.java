//poly - many ,morphism -behaviour (based on situation)
//1)compile time(overloading)   2)runtime (overriding) (behaviour is defined at runtime)
public class PolymorphismTelusko {
    
}
//dynamic method dispatch (for runtime polymorphism) 
/* class A {
    public void show(){
    System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
    System.out.println("in B show")
    }
}

class C {
    public void show(){
    System.out.println("in C show")
    }
}



class main{
    public static void main(String[] args){
        A obj = new A(); //type is parent(A) but object is child(B), if keep same name method in child who will be called? reference is of type parent but ot will call childs method.
        obj.show(); 

        obj = new B(); //reassigning a new object to the same variable 
        obj.show(); // this time obj is pointing to B objects address

        obj = new C(); //reassigning a new object to the same variable 
        obj.show(); // this time obj is pointing to C objects address
//Each time obj is calling show but it is being decided at runtime that which show will be called in every step hence its dynamic method dispatch.
        }
}
*/