import java.util.*;
public class string {
    public static void main(String[] args){
        StringBuilder stb = new StringBuilder("hello");
        int lengths = stb.length();
        for(int i=0;i<lengths/2;i++){
            int front = i;
            int back = lengths-1-i;
            
            char front1 = stb.charAt(front);
            char back1 = stb.charAt(back);

            stb.setCharAt(front, back1);
            stb.setCharAt(back , front1);
        }
        System.out.println(stb);
        // //Scanner sc = new Scanner(System.in);
        // String array[] = {"tpple","coy","apple","dog","bitch"};
        // int size = array.length;
        // for(int i =0;i<size;i++){
        //     for(int j=i+1;j<size;j++){
        //         if(array[i].compareTo(array[j])>0){
        //             String temp = array[i];
        //             array[i]=array[j];
        //             array[j]=temp;
        //         }
        //     }
        // }
        // for(int k=0;k<size;k++){
        //     System.out.print(array[k]+" ");
        // }
    }
}
