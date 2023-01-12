import java.util.Scanner;

public class Function_Display {
    public static void main(String[] args) {
        greeting(); //Calling the function.
        //sum1();
        //System.out.println();

        
    }

    static void sum1 ()  // void is used for displaying the value
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:- ");
        int a = sc.nextInt();

        System.out.println("Enter the number 2:- ");
        int b =  sc.nextInt();

        int c = a+b;
        System.out.println("the sum of the numbers are:-  "+c);
    }

    static void  greeting()  
    {
        Scanner sc = new Scanner  (System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }

   
}
