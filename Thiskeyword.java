public class Person{
    private int age;
    private String name;

    //Below getters and setters are created by clicking right key>source action>generate getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;//
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
        Human obj = new Human();
        obj.setName("Neer");
        obj.setAge(5);
    }
}