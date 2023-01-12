import java.util.Scanner;

public class Function_Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //String name = sc.next();
        //System.out.println(greet(name));
                   //OR                                     //For greet function
        // String greetings = greet("Aditya");
        // System.out.println(greetings); 


        // int ans = sum2(56,65);
        // System.out.println(ans);
               //OR                                        // For sum2 function
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(sum2(a, b));
        
    }
//Returning the value.
    static int sum1 () //Returning the value as integer.
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        return sum;  // it indicates that this functions ends here.

    }

    static int sum2(int a, int b )
    {
        int sum = a+b;
        return sum;
    }

//Returning the string
     static String greet(String name)
    {
        String greeting = "hello "+name;
        return greeting;
    }


    /*
     * return_type name(argumets){
     *      body
     *      return statement;
     * }
     */
}
