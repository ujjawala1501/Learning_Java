/*
 Types of Errors:
 1)compile time error > we are shown at compiling time.

 2) Runtime Error > code is working smoothly ,no compile time error but suddenly the code STOPSS!!  (this is where exception handling comes which means to handle the pre assumed errors)(example . > arrayoutofbound ,arithmeticexception etc)

 3) Logical error > when output is wrong(you fucked up!)now you need to test everything EVERY DAMN THING !
 
 We can have multiple try ,catch executes only when there is some error otherwise it will pass.
 */
//Some exceptions which we are not sure of ->catch(Exception e) //Exception is a parent class it can handle any exception .
public class Exceptions {
    public static void main(String[] args){
        int i = 9;
        int j = 0;
        try //try to execute this statemenent ,if there is an error continue the next code but throw the error from here to exception class and I as a dev will catch it 
        {
         j = 18/i; //this is critical ,what if value of i is 0?(youll get arithmetic exception)and this will stop the execution
        }
        catch(ArrayIndexOutOfBoundsException e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        catch(ArithmeticException e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        catch(Exception e)//e can be obj as well)
        {
            ///if trying to handle multiple try in single catch, you can either give if statement inside cath OR you can write multiple cath OR mention the exception with catch like this ->catch(ArithmeticException e)
            System.out.println("Something went wrong"+ e);//"e" here will show the exception we got.
        }
        System.out.println(j);
    }
    
}
/*which exceptions are important to handle 
 Errors are something we cant handle.
 runtime Exceptions such as Arithmatic ,ArrayIndexOutOfBound,Null pointer ,for SQL exception IOException these we can handle whereas SQLException areChecked exceptions and Runtime exceptions are called Unchecked Exception
 */