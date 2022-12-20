//Primitive data type means :- last data typr which we cannot break in to another data type is known as primitive data type.  

import java.util.*;
public class Primitive {
    public static void main(String[] args) {
        // int rollno = 1;
        // char c = 'l';  //for character we use only single quote.
        // float f = 25.5f;  //all the decimal numbers are stored in double value by default , so convert in float we use f here.
        // double d = 6865186158.77357;  //used for large decimal numbers.
        // long l = 644441519191003611L; //used for large integer numbers.
        // boolean check = false; 

        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter some input :- ");
        // int rno = sc.nextInt();
        // System.out.println("your roll no is = "+rno);

        float f = sc.nextFloat();
        System.out.println(f);
    }
}
