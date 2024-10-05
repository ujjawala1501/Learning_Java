@FunctionalInterface
interface A 
{
    void show();

}

public class Lambdaexpression 
{
    public static void main(String[] args){
        A obj = new A();
        {
            public void show(){
                System.out.println("in show method");
            }
        };
        obj.show();
    }
    
}
