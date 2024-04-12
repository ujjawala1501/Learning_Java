import java.util.Scanner;

class hello {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
        
        scanner.close(); // Close the Scanner object to prevent resource leak
    }
}