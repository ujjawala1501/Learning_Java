 class Calculator{
    int num = 5;   //This is an instance variable this can also be accessed with the help of the object of class we will create in main method.
    public int add(int n1,int n2){
        int result = n1 + n2 ;
        System.out.println("Currently inside Calculator class and add method");
        return r;
    }
}

public class Method
{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator(); //created 2nd object of class Calculator
        cal1.num = 8; //example that the instance can be changed through object created for class.
        System.out.println(cal.num); //this gives num=5
        System.out.println(cal1.num); //this give num=8
        int n1 = 2;
        int n2 = 3;
        System.out.println("Inside main method of Method class and in the next line calling add method");
        int result = cal.add(n1,n2);
        int result2 = cal1.add(4,6);
        System.out.println(result2);

    }
}
