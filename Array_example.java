class Student{
    String Name;
    int rollno;
    int marks;
}
public class Array_example{
    public static void main(String[] args){
       //Creating Object for student class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

      // Assigning values to instance variables in Student class.
        s1.Name = "Kiran";
        s1.rollno = 12;
        s1.marks = 88;

        s2.Name = "taran";
        s2.rollno = 12;
        s2.marks = 67;

        s3.Name = "sharan";
        s3.rollno = 14;
        s3.marks = 75;

      //Creating "students" array to store the above students information
        Student student[] = new Student[3]; //3 is the size of the array as we have 3 objects above so we took 3 as its size
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        //
    }

}