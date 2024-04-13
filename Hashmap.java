import java.net.SocketPermission;
import java.util.*;
public class Hashmap {

    public static void main(String[] args) {
        
        //Country(key),Population(Value)
        HashMap<String,Integer> mp1=new HashMap<>();
        mp1.put("India", 120);
        mp1.put("USA",20);
        mp1.put("China",150);

        System.out.println(mp1);
        //Trying to change The value for China
        //IF Key is not already there then it will create new key and will add the value to it
        mp1.put("China",342);
        System.out.println("After change of Value for China: " + mp1);

        //Search Operation
        //search if key is there or not (ContainsKey)
        if(mp1.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present");
        }

        //To get the value for provided Key
        System.out.println(mp1.get("China")); //Key exists
        System.out.println(mp1.get("Indonesia")); //Key doesnt exists


    }
    
}
