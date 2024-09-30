//
//
enum Status{ //here status is a class 
Running, failed, pending, success; // all these are objects of status

}
public class enumeration {
    public static void main(String[] args) {
        int i = 5;
        Status s1 = Status.Running;
        System.out.println(s1);
        Status[] ss = Status.values();

        for(Status s: ss){
            System.out.println(s + " : "+ s.ordinal()); //ordinal means index 
        } 
    }
    
}
