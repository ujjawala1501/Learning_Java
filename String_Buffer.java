//Mutable strings (String Buffer or String Builder)
// immutable Strings normal String
//In String Buffer capacity is allocated for the value so length and capacity are two diff. things in String buffer.
//A static variable is common for all the objects 
//Example

public class String_Buffer {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity()); //gives output 21 (capacity provided for Navin) ,inside heap memory the value will be placed but suppose its bigger than the capacity provided the value will be moved to some other place hence to avoid we get extra capacity 
       //There are several methods provided to use in String Buffer hence its Mutable
        sb.append("reddy");
        System.out.println(sb); 
        sb.insert(6, "java");
        sb.setLength(30);
        sb.deleteCharAt(2);

        //String Builder
        //There is only one difference in String Buffer is Thread Safe and String Builder is not.


    }
    
}
