import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        // Scanner sc  = new Scanner (System.in);
        // float num = sc.nextFloat();
        // System.out.println(num);

        //Typecasting-
        // int n = (int)(68.354f);  //Narrow typecasting.
        // System.out.println(n);

        //automatic type promotion in expression.

        // int a = 260;
        // byte b  = (byte)(a);
        // System.out.println(b); //output will be 4 because it is 4 gretaer than 256 which the range of bytecode.


        // int number = 'a';
        // System.out.println(number); //output will be ascii value of a.
         byte b = 40;
        int i = 1;
        char c = 'l';  //for character we use only single quote.
        float f = 25.5f;  //all the decimal numbers are stored in double value by default , so convert in float we use f here.
        double d = 6865186158.77357;  //used for large decimal numbers.
        long l = 644441519191003611L; //used for large integer numbers.
        boolean check = false; 
        double result = (f*b)+(i/c);
        System.out.println((f*b)+" " +(i/c));
        System.out.println(result);
    }
}
