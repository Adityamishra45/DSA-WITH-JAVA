// Instead of defining the name or the rno in the main class we will
// do inside the cunstrocter.

public class thisKeyword {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name);
        Student student2 = new Student();
        student2.greeting();
        // System.out.println();
        student2.changedName("Mishra");
        student2.greeting();

        Student st1 = new Student(10142,"Aditya",7.75f);
        System.out.println(st1.name);
        System.out.println(st1.marks);

        Student random = new Student(student1); // it will call the student 1 properties.
        System.out.println(random.name);
    }
}

class Student{
    String name;
    int rno;
    float marks;

// we need  a way to add the values of the above properties object by object.
// we need one word to access every object. for that we use (this) keyword.

    void greeting() {
        System.out.println("Hello "+name);
    }

    void changedName(String names){
        name = names;
    }

    Student(Student other) // Here other is just a name. Now when we call the constructor with one value this method is going to be called. And it will print the 
    {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() // cunstructor
    {
        this.name = "Aditya"; //this is going to replace with student1.
        this.rno = 10142;
        this.marks = 7.75f;
    }

    Student(int rno , String name , float marks)  //when you call the constructor with three value this constructor will be called otherwise the above one will be called. This is known as constructor overloading.
    {
        this.rno = rno;  
        this.name = name;
        this.marks = marks;
    }

}
