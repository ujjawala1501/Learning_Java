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
         //       numbers[i][j] = (int)(Math.random() *100) ; This line is how we can assign random number to array ,100 is being multiplied because the random function always give output in double ,we need that in int form.
            }
        }

        //Loop for output in 2D Array
        for(int i=0;i<rows;i++){
            for(int j=0 ;j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        //Another kind  for loop to print output
        System.out.println("Below output is to test Another kind of 'For' Loop");
        for(int n[] : numbers){  //Here n is not a single number it is an array which is reading from numbers array
            for(int m : n){  // m is reading from n array
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}

