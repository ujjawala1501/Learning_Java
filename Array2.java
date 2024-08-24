import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size =sc.nextInt();
        System.out.println("Enter the number as many times as you've given size of the array:");
        int numbers[] =new int[size];
        //for loop to take input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        //for loop to give output of array
        for(int i=0; i<size;i++){
            System.out.println(numbers[i]);
        }
    }
    
}
//Java by default assigns values for data types: int->0 ,float->0.0 ,boolean->false ,string ->" ".
//Updated