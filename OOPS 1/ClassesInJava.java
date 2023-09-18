public class ClassesInJava {
    public static void main(String[] args) {
        Student student1 = new Student();  // student() :- constructor.
        student1.name = "Aditya Kumar Mishra";
        student1.rollNo = 10142;
        student1.marks = 7.75f;
        System.out.println(student1.marks);
    }
}
class Student // Class works as a template for the objects.
{ 
    String name;
    int rollNo;
    float marks;
}
