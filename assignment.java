import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
//Q1. Write a program to print whether a number is even or odd, also take input from the user.
        // int N = sc.nextInt();
        // if(N%2 == 0)
        // {
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("odd");
        // }

//Q2.Take name as input and print a greeting message for that particular name.
        // String Name = sc.next();
        // System.out.println("Hello"+Name);

        //Q3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        // int  P = sc.nextInt();
        // float r = sc.nextFloat();
        // float T = sc.nextFloat();
        // float si = (P*r*T)/100;
        // System.out.println("Your simple interest will be:- "+ si);
        

//Q3. Take input of  two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        char symbol = sc.next().charAt(0);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
      
        if(symbol=='+')
        {
            System.out.println(num1+num2);
        }
        else if(symbol == '-')
        {
            System.out.println(num1-num2);
        }
        else if(symbol == '*')
        {
            System.out.println(num1*num2);
        }
        else
        {
            System.out.println(num1/num2);
        }
    
    

//Q5. Input currency in rupees and output in USD.
        // System.out.print("Please enter the amount which you want to convert.:- ");
        // int Ruppes =  sc.nextInt();
        // double $ = Ruppes/82.68;
        // System.out.println("Your rupees in $ will be = "+$);

      }
    }
