//annotation help to communicate with compiler with the problem and it helps like you can mention in B that its override and it will let you know if you c=have created any methods with same name which can be overridden(if name is biiiigg and you are unable to check yourself of course)
//there are other annotation inbuilt as well.
class A 
{
    public void showThedatawhichbelongstothisclass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void showThedatawhichbelongstothisclass(){
        System.out.println("In B show");
    }

}

public class Annotation
{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}
/*
 Annotations in Java are a form of metadata that provide additional information about the program. They are used to give instructions to the compiler or to be processed at runtime by various tools and frameworks. Annotations start with the @ symbol and can be applied to classes, methods, fields, parameters, and other program elements.
Key Features of Annotations
Metadata:
Annotations act as metadata, meaning they describe other data. They do not change the behavior of the program directly but can influence how the program is compiled or executed.
Syntax:
The basic syntax of an annotation is:
java
@AnnotationName

For example, @Override is an annotation that indicates a method is overriding a method in its superclass.
 */