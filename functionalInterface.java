//interface which have only one method.
@FunctionalInterface //if this is mentioned you cannot create multiple methods in there.
interface A
{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class functionalInterface {
    public static void main(String[] args)
    {
        A obj =new B();
        //obj.show();
        {
            public void show()
            {
                System.out.println("In show of anonymous class");
            }
        };

    }
    
}
