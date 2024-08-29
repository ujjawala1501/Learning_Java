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

        //To Traverse through the Hashmap and get values 
        //but first we'll see about Traversing  the Array
        int arr[]={12,15,18};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();

        //How else can we write the above code
        for(int val:arr){
            System.out.print(val +" ");
        }
        System.out.println();

        //Traversing Hashmap
        //for(Map.Entry<Integer,Integer>e;Map.entrySet())
        //for loop (name.Entry<Key datatype,Value data type>element;Creating a set version of map and then each pair will be stored as element (e) )
        //e is a set version which will have all the pairs ex-> e=["India",120] 
        for(Map.Entry<String,Integer>e:mp1.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Create set of keys
        Set<String>keys = mp1.keySet();
        for(String key:keys){
            System.out.println(key+" "+mp1.get(key));
        }

        //Remove pair in Hashmap
        mp1.remove("China");
        System.out.println("After removing China " +mp1);

    }
    
}
