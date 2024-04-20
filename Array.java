import java.util.*;
public class Array {
    public static void main(String[] args) {
     int[] marks =new int[3];
     //OR
     int marks1[] =new int[3];
     //************************ */
     marks[0]=97;
     marks[1]=98;
     marks[2]=99;
     System.out.println(marks[0]);
     System.out.println(marks[1]);
     System.out.println(marks[2]);

     //OR
     for(int i=0;i<3;i++){
        System.out.println(marks[i]);
     }
    }
    
}
//Other way to define an array if we already know the number of integers we need and the values as well
//type[] arrayName ={n1,n2,n3}
//int marks[] ={91,92,93};

