//annotation help to communicate with compiler with the problem and it helps like you can mention in B that its override and it will let you know if you c=have created any methods with same name which can be overridden.
class A 
{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }

}

public class Annotation
{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}