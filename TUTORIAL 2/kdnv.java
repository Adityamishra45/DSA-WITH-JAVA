import java.util.Scanner;

public class kdnv {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int I = sc.nextInt();
        int n =1;
        while(n<I)
        {
            if(n%2 != 0)
            {
                System.out.println(n);
            }
            
            n++;
        }

    }
    
}
