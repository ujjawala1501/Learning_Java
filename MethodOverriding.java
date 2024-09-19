//you give preference to your own feature first 
//same method name ,same parameter but different operation like add methods here.
class A{
    public void show(){
        System.out.println("in show");
    }

    public int add(int n1,int n2){
        return n1+n2;
    }
/*     public void config(){
        System.out.println("in config");
    }*/
}
class B extends A 
{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
   /*  public void show1(){
        System.out.println("In B show1");
    }*/

}
public class MethodOverriding {
    public static void main(String[] args) {
        A obj = new A();
        int r1 = obj.add(2,3); //here this will first search for add method in B class if the method would not have been there pointer would go to parent class this is overriding.
        System.out.println(r1);
    }
}
