import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // // System.out.println("The numbers before swapping:- "+a+" "+b);
        // int temp = a;
        // a=b;
        // b =temp;
        // System.out.println("The numbers after swapping:- "+a+" "+b);
        swap(a,b);


        String city = "Gorakhpur";
        change(city);
        System.out.println(city);
    }
    // public static void swap(int a , int b)
    //     {
    //         int temp = a;
    //         a=b;
    //         b=temp;
    //         System.out.println(a+" "+b);
            
    //     }

    public static int swap (int a,int b)
    {
        int temp=a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
        return 0;
    }

    public static void change(String city) // we 
    {
        city = "Lucknow"; //We are creating the new object here that's why it won't change the value.
        // System.out.println(city);
    }
}
