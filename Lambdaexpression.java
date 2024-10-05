@FunctionalInterface
interface A 
{
    void show(int i,int j);

}

public class Lambdaexpression 
{
    //  Below anything that is commented is normalyy how it works but hence we using lambda (arrow) we do not need those things, so commented them.
    public static void main(String[] args){
        A obj = (int i , int j)-->///new A();/Adding this Arrow here is the only thing that is lambda expression 
     //   {
            //public void show(){ //commented because usign lambda (arrow thing...)
                System.out.println("in show method");
            //}
     //    };
        obj.show(5,6);
    }
    
}
