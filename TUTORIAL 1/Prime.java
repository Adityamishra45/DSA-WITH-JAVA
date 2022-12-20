import java.util.*;

public class Prime {    //in general class name should start with capital letter.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c =2;
        for (c=2;c*c<N;c++)
        {
            if(N%c==0)
            {
                System.out.println("Not a prime number.");
            }
            else{
                c = c+1;
            }
        }
        System.out.println("prime number.");

        
    }
}