
//final - variable ,method , class
class A{ // final class A ->will stop  inheritance
    public final void show(){ //this will stop overriding of method

    }
    public void add(int n1, int n2){
        
    }
}
class AdvCalc extends A{ //if I name "class A" as "final class A" this class wont be able to inherit "class A"

}


public class finalkeyword {
    public static void main(String[] args) {
      final int num = 9 ; //final make it constant(cannot change)
      //  num = 8; //getting error because cannot change a value once specified final
    }
    
    
}
