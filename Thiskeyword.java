package Learning_Java;

class Person{
    private int age;
    private String name;

    //Below getters and setters are created by clicking right key>source action>generate getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int a) { //"a" is local var ,age is instance variable if we use same names without "this" keyword like age =age here this will be a confusion as which is instance var and which is local variable to solve this
//we can create new object for Person right here and instead of "this.age" we can write obj.age but we will need to pass this obj in "Thiskeyword"class like this "obj.setAge(5,obj)" hence to avoid this java has a keyword "this" which tells
// interpreter that it is current object.
        this.age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    
}

public class Thiskeyword{
    public static void main(String[] args){
        Person obj = new Person();
        obj.setName("Neer");
        obj.setAge(5);
    }
}