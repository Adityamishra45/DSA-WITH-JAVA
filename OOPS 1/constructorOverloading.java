public class constructorOverloading {
    public static void main(String[] args) {
        // Student st1 = new Student("Mishra", 7.75f , 10142);
        // System.out.println(st1.name);

    // It is known as cunstructor overloading.

        Student st2 = new Student(); // here we are calling the 0 values constructor. Example of constructor overloading.
        System.out.println(st2.name);
        st2 = new Student();
    }
}

class Student{
    int rno;
    String name;
    float marks;

    //Both of the following cunstructer are having the same name but different arguments.

    // Student() //Cunstructor
    // {
    //     this.name = "Aditya";
    //     this.marks = 7.75f;
    //     this.rno = 10142;
    // }

    Student(){
        //this is how you call a constructer from another constructer.
        this("Mishra" , 7.75f , 10142);
    }

    //Student st1 = new Student("Mishra", 7.75f , 10142);
    //Here, this will be replaced with st1.
    Student(String name, float marks , int rno)   // if the variable name is same as the main student class then we need to use the this keyword otherwise it is fine not to use this keyword. 
    {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
}
