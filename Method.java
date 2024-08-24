class Calculator{
    public int add(int n1,int n2){
        int result = n1 + n2 ;
        System.out.println("Currently inside Calculator class and add method");
        return result;
    }
}

public class Method
{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int n1 = 2;
        int n2 = 3;
        System.out.println("Inside main method of Method class and in the next line calling add method");
        int result = cal.add(n1,n2);

    }
}