//https://www.javatpoint.com/inheritance-in-java

class EmployeeParentClass{  
    float salary=40000;  
   }  
   
public class InheritanceChildClass extends EmployeeParentClass{
    int bonus=10000;  


    public static void main(String args[]){  
        InheritanceChildClass icc=new InheritanceChildClass();  
        System.out.println("Programmer salary is:"+icc.salary);  
        System.out.println("Bonus of Programmer is:"+icc.bonus);  
   }  
   }  
    

