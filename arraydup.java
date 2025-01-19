import java.util.*;
public class arraydup {
    public static void main(String[] args){
        Scanner ref = new Scanner(System.in);
        int array1[] = {1,2,2,3,3,4,4,5,5};
        List<Integer> result = new ArrayList<Integer>();

        for(int i =0;i<array1.length;i++){
            for(int j = i+1;j<array1.length;j++){
                if (array1[i] != array1[j]){
                    result[i]=array1[i];
                }
            }
        }
        for(int k=0;k<result.length;k++){
            System.out.println(result[k]);
        }
    
    }
    
}
