/*
 Types of Errors:
 1)compile time error > we are shown at compiling time.

 2) Runtime Error > code is working smoothly ,no compile time error but suddenly the code STOPSS!!  (this is where exception handling comes which means to handle the pre assumed errors)

 3) Logical error > when output is wrong(you fucked up!)now you need to test everything EVERY DAMN THING !
 */
public class Exceptions {
    public static void main(String[] args){
        int i = 9;
        int j = 0;
        try //try to execute this statemenent ,if there is an error continue the next code but throw the error from here to exception class and I as a dev will catch it 
        {
         j = 18/i; //this is critical ,what if value of i is 0?(youll get arithmetic exception)and this will stop the execution
        }
        catch(Exception e)//e can be obj as well)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
    }
    
}
