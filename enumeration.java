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
//enumeration with if.else and switch 
/* 
enum Status1{
    Running, Failed, Pending, Success;
}
public class enumeration{
    public static void main(String[] args){
        Status1 s2 = Status1.Pending; //setting "s" value as Pending.

        if(s2==Status1.Running){
            System.out.println("all good running");
        }
        else if(s2==Status1.Failed){
            System.out.println("it failed ");
        }
        else if(s2==Status1.Pending){
            System.out.println("pending wait");
        }
        else{
            System.out.println("its Success");
        }

    }
}
*/
 
 