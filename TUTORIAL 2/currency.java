/* Xee jing was travelling from Korea to USA and he was not aware of the currency system of USA. Can you please help him to add two dollars and cents?
INPUT & OUTPUT FORMAT:

Input consists of 4 integers.

First two inputs correspond to the value of the first dollar and cent.

Next two inputs correspond to the value of the second dollar and cent.

Output should print the sum of dollar and cent.*/

import java.util.*;
public class Main
{
  

public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first amount in doller:- ");
        int d1 = sc.nextInt();
        System.out.println("Enter the first amount in cents:- ");
        int c1 = sc.nextInt();
        System.out.println("Enter the second amount in doller:- ");
        int d2 = sc.nextInt();
        System.out.println("Enter the second amount in doller:- ");
        int c2 = sc.nextInt();

        
        int sum1 = d1+d2;
        int sum2 = c1+c2;
       while(sum2>=100)
       {
         sum1= sum1+1;
         sum2 = sum2-100;
       }
         System.out.println("The dollars are:- "+sum1);
         System.out.println(" Remaining cents are :-  "+sum2);  
        
    }
}
