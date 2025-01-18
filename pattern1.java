import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        Scanner ref = new Scanner(System.in);
        int n = ref.nextInt();
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
