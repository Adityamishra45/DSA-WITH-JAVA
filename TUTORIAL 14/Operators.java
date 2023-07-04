import java.util.ArrayList;
// in java operator overloading is not supported.
public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');  //taking the ascii values of a and b. 
        System.out.println("a"+"b"); //just adding the a and b which will cause ab.
        System.out.println((char)('a'+3)); //ASCII valuea of d because a+3 = d.

        String ans = new Integer(56)+""+new ArrayList<>();  //we are using "" in the between because one of the objects has to be the string because only string is supported in java for operator overloading.
        System.out.println(ans); // watch at 55:49
        // for theory go to min 48
    }
}
