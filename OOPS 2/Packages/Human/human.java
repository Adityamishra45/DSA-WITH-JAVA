package Packages.Human;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // it means it is common to all the objects.
    public human(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population += 1; //in order to use the static variable we should use the class name itself.
    }
    public void greeting() {
    }
}
