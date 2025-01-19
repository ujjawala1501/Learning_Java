import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("enter row and column");
        int rows  = ref.nextInt();
        int cols  = ref.nextInt(); 
        int array2d[][] = new int[rows][cols];
        int check = 3;
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array2d[i][j] = ref.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    System.out.print(array2d[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (array2d[i][j] == check){
                    System.out.println(i+"row and "+j+" column");
                }
            }
        }
        // Scanner ref = new Scanner(System.in);
        // int size = ref.nextInt();
        // int array1[] = new int[size];

        // for(int i =0 ;i<size;i++){
        //     array1[i] = ref.nextInt();
        // }
        // for(int j =0 ;j<size;j++){
        //     if(array1[j]==2){
        //     System.out.print("index is "+j);
        //     }
        // }
    //  int[] marks =new int[3];
    //  //OR
    //  int marks1[] =new int[3];
    //  //************************ */
    //  marks[0]=97;
    //  marks[1]=98;
    //  marks[2]=99;
    //  System.out.println(marks[0]);
    //  System.out.println(marks[1]);
    //  System.out.println(marks[2]);

    //  //OR
    //  for(int i=0;i<3;i++){
    //     System.out.println(marks[i]);
    //  }
    
    }
    
}
//Other way to define an array if we already know the number of integers we need and the values as well
//type[] arrayName ={n1,n2,n3}
//int marks[] ={91,92,93};

