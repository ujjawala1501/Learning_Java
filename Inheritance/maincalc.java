//When there is inheritance each class if in different file must be compiled and better if compiled together like below
// "Javac Inheritance/calc1.java Inheritance/calc2.java Inheritance/maincalc.java "
package Inheritance;

public class maincalc {
    public static void main(String[] args){
        calc2 obj = new calc2();
        int add_rslt = obj.add(2,3);
        int sub_rslt = obj.sub(5,2);
        int multiply_rslt = obj.multiply(2,3);
        int division_rslt = obj.division(2,3);

    //System.out.println("Addition : " +add_rslt+ "sub" +sub_rslt+ "multiply" +multiply_rslt+ "division" +division_rslt);
    System.out.println("Addition: " + add_rslt + ", Subtraction: " + sub_rslt + ", Multiplication: " + multiply_rslt + ", Division: " + division_rslt);
    }
} 

