    /*
    String pool is nothing but a storage area in Java heap where string literals stores. 
    It is also known as String Intern Pool or String Constant Pool. It is just like object 
    allocation. By default, it is empty and privately maintained by the Java String class. 
    */

public class StringPool{
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Aditya";

        // Since the  Value is same for a and b and all the similar values of String are not re-created.
        // we store the Aditya in the string pool and both the variables a and b are pointing to the same value.
        // It is to used to optimize the memory.
        System.out.println(a);
        System.out.println(b);
    }
}