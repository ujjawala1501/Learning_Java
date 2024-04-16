import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int numbers[] =new int[size];
        //for loop for input
        for(int i=0;i<size;i++){
            numbers[i] =sc.nextInt();
        }
        //for loop for output of array
        for(int i=0; i<size;i++){
            System.out.println(numbers[i]);
        }
    }
    
}
//Java by default assigns values for data types: int->0 ,float->0.0 ,boolean->false ,string ->" "
