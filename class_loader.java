class Mobile{
    char name;
    int phonenum;
    static string brand;

    //Static block is used to initialize static variable
    static{
        brand= "samsung";
        System.out.println("In static block");
    }
    public void show(){
        System.out.println("name : "+brand+" phonenumber : "+phonenum );
    }
}

public class Demo{
    public static void main(String[] args) throws ClassNotFoundException{

        //this is how we can load class without creating object
        //everytime we will create object static will load first and then other meth
        Class.forName(Mobile);
    }
}