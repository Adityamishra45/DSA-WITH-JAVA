// In Java, variables are only accessible inside the region they are created. This is called scope.

import java.util.Random;
import java.util.Scanner;

public class Scoping {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        random(a,b);

    }

    static void random(int a , int b)
    {
        System.out.println(a+" "+b);    //This change will be valid in this function only.

    }
}
