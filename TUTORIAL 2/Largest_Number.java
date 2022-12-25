import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // if(a>b && a>c)
        // {
        //     System.out.println("a is largest");
        // }
        // else if(b>a && b>c)
        // {
        //     System.out.println("b is largest");
        // }
        // else{
        //     System.out.println("c is largest");
        // }


//Another method:-

        int max = Math.max(c, Math.max(a,b));
        System.out.println("The maximum number is:- "+max);
    }
    
}

