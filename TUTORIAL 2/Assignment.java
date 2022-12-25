import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public class Assignment 
{
    public static void main(String[] args) 
    {

//Q1 - Fibonacci Series In Java Programs.
        // Scanner sc  = new Scanner (System.in);
        // int no_of_terms = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // int c = 2;

        // for(int i=0;i<=no_of_terms;i++)
        // {
        //     a=b;
        //     b=c;
        //     c=a+b;
        //     System.out.println(a+"");
        // }

//Q2- Input a number and print all the factors of that number (use loops).

            // Scanner sc  = new Scanner (System.in);
            // int n = sc.nextInt();

            // for(int i=1; i<=n; i++)
            // {
            //     int factors = n;
            //     if (factors%i == 0)
            //     {
            //         System.out.println(i);
            //     }
               
            // }

//Q3:- ERR - Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

                // Scanner sc  =new Scanner (System.in);
                // int input = sc.nextInt();
                // int n =1;
                // while(input != 0)
                // {
                   
                //     if(input == 0)
                //     {
                //         System.out.println("err");
                //     }
                //     n++;
                // }
                // System.out.println(n);
                // }
//Q4:- count the number of times a number appeared.

                    // Scanner sc  =new Scanner (System.in);
                    // int n = sc.nextInt();
                    // int i =0;
                    // while(n>0)
                    // {
                    //     int rem = n%10;
                    //     if(rem==5)
                    //     {
                    //         i++;
                    //     }
                    //     n=n/10;
                    // }
                    // System.out.println(i);

                    Scanner sc  =new Scanner (System.in);
                    long n = sc.nextLong();
                    long count = 0;
                    while(n>0)
                    {
                        // int rem = n%10;
                        if(n%10==5)
                        {
                            count++;
                        }
                        n=n/10;
                    }
                    System.out.println(count);


        }
            
}

    

