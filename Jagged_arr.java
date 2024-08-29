import java.util.*;

class Jagged_arr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][]; //jagged array (different number of columns for each row)
        System.out.println("Enter no. of columns for 1st row :");
      //  arr[0] = new int[3];      This is constant
          int r1 = sc.nextInt(); //This will take user input for number of columns
          arr[0] = new int[r1];
        System.out.println("Enter no. of columns for 2nd row :");
      //  arr[1] = new int[4];      This is constant
        int r2 = sc.nextInt();   //This will take user input for number of columns
        arr[1] = new int[r2];
        System.out.println("Enter no. of columns for 3rd row :");
      //  arr[2] = new int[2];      This is constant
        int r3 = sc.nextInt();   //This will take user input for number of columns
        arr[2] = new int[r3];

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random() *100);
            }
        }
        for(int n[] :arr){
            for(int m : n){
                System.out.print(m+" " );
            }
            System.out.println();
        }
    }
}