//Its similar to Matrix 
//    0  1   2  3
//0
//1
//2
//Memory consumption->(rowsxcols)Xdatatypesize
//Declaration 
//type[][] arrayName = new type[rows][columns];
//Example-> int[][] numbers = new int[rows][columns];     
import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
        //We use nested loop where outer loop controls Number of rows whereas  inner loop will control number of columns in each row
        //i=0 >1st row ->0,1,2,3 (columns) similarly for other rows
        
        //Loop for Input in 2D Array
        for(int i=0 ;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j] =sc.nextInt();
            }
        }

        //Loop for output in 2D Array
        for(int i=0;i<rows;i++){
            for(int j=0 ;j<columns;j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
