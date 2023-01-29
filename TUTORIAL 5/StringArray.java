import java.util.Scanner;
import java.util.Arrays;
public class StringArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        String[] str = new String[2];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Aditya";   //changing the value of index 1.
        System.out.println(Arrays.toString(str));
    }   
}
