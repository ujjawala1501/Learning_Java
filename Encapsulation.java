//Every time we create a instance variable we need to keep it private so that no one can access it directly we can access it indirectly though using methods
//we can name get and set any thing we want like "xyz" or"ffgh" but that will create confusion while reading so use get while getting the value and set while setting the value
//Getters and setters can be created using IDE.
package Learning_Java;
class Human{
//Below variables are examples of getting the values
private int age = 11; //accessible only in the same class
private String name = "Laxmi";

//Below are the examples for setting the values as you can see the values have not been assigned here itself like above variables.
private int height; 
private String address; 

//doing this to access the above private datas 
public int getAge(){ //use get_name of variable_ to get the value
    return age; //this will fetch the value as its in the same class

}
public String getName(){
    return name;
}

//Below methods will be used to set values for height and address
public void setHeight(int a){
    height = a;

}
public void setAddress(String n){
    address = n;

}

//Below is to get the values and print height and address as we need getters to print the private variables
public int getHeight(){ //use get_name of variable_ to get the value
    return height; //this will fetch the value as its in the same class

}
public String getAddress(){
    return address;
}

}
public class Encapsulation {
    public static void main(String[] args){
        Human obj = new Human();
      //  obj.age=11; //this will throw error because its private
      //  obj.name = "Navin";  //this will throw error because its private
        
      //Below is how we are indirectly assigning values to private variables (through object)
        obj.setHeight(6);
        obj.setAddress("Bangalore");

        System.out.println(obj.getName() + " : " + obj.getAge()); //This is how we will be able to access the values ,through the methods created in the same class.
        
        System.out.println(obj.getHeight() + " : " + obj.getAddress()); //to get the values we will need to create getters like getName and getAge
    }
    
}
