class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2(){
        System.out.println("In B show");

    }
}
public class UpcastAndLowrcast{
    public static void main(String[] args){
        A obj = (A) new B(); //first we doing"for reference of creating object of B" second we Typecasting object B to A (Parent) hence we are going up in level ,hence here its called UPCASTING
        obj.show1();
    
        //obj.show2(); //cant call 
        B obj1 = (B) obj; // I know that the obj is of A type but the object is B so please typecast it to B this is called Downcasting
        obj1.show2();
    }

}