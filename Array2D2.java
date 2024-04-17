//Q.Take a Matrix as input from the user.Search for a given number x and print the indices at which it occurs
//
import java.util.*;
public class Array2D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns=sc.nextInt();
        int x = 34;
        int[][] number2d = new int[rows][columns]; 

        //Take input loop
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                number2d[i][j] = sc.nextInt();
            }
        }
        //Chck for Value and print it out
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if (number2d[i][j] ==x){
                    System.out.println(i +" "+ j);
                }
            }
        }
    }
}
