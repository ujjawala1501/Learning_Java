
// @FunctionalInterface
// interface A {
//     void show();
// }

// public class interface1 {
//     public static void main(String[] args) {
//         A obj = new A(){
//             public void show(){
//                 System.out.println("IN SHOW OF INTERFACE");  //using method of interface without implementing it to class
//             }
//         };
//         obj.show();
//     }
    
// }
//LAMBDA 
interface A {
    void show();
}

public class interface1{
    public static void main(String[] args){
        A obj = () -> System.out.println("in show");
        obj.show();
    }
}
