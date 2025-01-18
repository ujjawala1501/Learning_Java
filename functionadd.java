import java.util.Scanner;

public class functionadd {
    // public static void addnum(int num1,int num2){
    //     int sum = num1+ num2;
    //     System.out.println(sum);
    //     return;
    // }
    public static int facto(int num3){
        int fact = 1;
        while(num3>0){
            fact = fact * num3;
            num3 = num3-1 ;
            
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner ref1 = new Scanner(System.in);
        System.out.println("enter a numbers");
        // int num1 = ref1.nextInt();
        // int num2 = ref1.nextInt();
        int num3 = ref1.nextInt();
        int fact = facto(num3);
        System.out.println(fact);
       // addnum(num1, num2);
       

    }
}
