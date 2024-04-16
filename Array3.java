//Q.Take an array as input from the user.search for a given number x and print the index at which it occurs
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        int x = 99;
        //for loop for taking input of values
        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
        //We can use arrayName.length(array.length) to get the lngth of array
        for(int i=0; i< array.length ;i++){
            if (array[i] == x){
                System.out.println("found at index" +i);

            }
        }


    }
    
}
