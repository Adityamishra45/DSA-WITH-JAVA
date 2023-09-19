package Packages.Human;

// we do not require the import statement here to import the human class from the another file because they both are in the same package or the folder.
public class Main {
    public static void main(String[] args) {
        human aditya = new human(21, "Aditya" , 1000001 , false);
        human mishra = new human(21, "Mishra" , 1000001 , false);
        human kumar =  new human(21,"kumar",100001,false);
        System.out.println(aditya.name);
        System.out.println(human.population);
        // greeting(); // it will give the error because it's non static.
    }

    // Something which is non static belongs to objects.
    void greeting() //it cannot be used in the static methpod because it is a non static method.
    {
        System.out.println("Hello");
    }
}
