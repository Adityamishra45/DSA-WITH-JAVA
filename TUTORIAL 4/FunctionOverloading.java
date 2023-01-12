/*Function overloading means:- There can be two functions with the same name but their return type should be different OR 
their number of arguments should be different.. */

public class FunctionOverloading {
    public static void main(String[] args) {
       main(50,30);
       main("Aditya");
    }

    static void main (int a , int b)
    {
        System.out.println(a+" "+b);
    }

    static void main (String name)
    {
        System.out.println(name);
    }

}
