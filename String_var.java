//String is not primitive type like other data types they start
// with small letter but while describing "String" it starts with capital "S"its a class .
//String constant pool is used to save memory (if one value is been assigned to a variable the next if the same value gets assigned to new variable it will be pointing to the previous values address)
import java.lang.String;
public class String_var{
    public static void main(String[] args){
        String Name = new String("Neer");   //We can assign a value like this. "original" is given by IDE you can remove that.
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  //We can assign a value like this as well.
        System.out.println("The length of the txt string is: " + txt.length());

        //Below is example of how String is a class and has Methods one of which is "indexof()"
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        //Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //Concatenation using "concat()" method
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName.concat(lastName));

        //Java uses the + operator for both addition and concatenation.
        //Numbers are added. Strings are concatenated.
        //Below is the example of how int type works and how string type works
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)


        String xA = "10";
        String yA = "20";
        String zA = xA + yA;  // z will be 1020 (a String)
    }

}
