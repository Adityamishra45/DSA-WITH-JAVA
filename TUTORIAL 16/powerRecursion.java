import java.util.*;
public class powerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long number = a;
        System.out.println(square(a,b));
    }
    static long square(long a, long b){
        long result , finalResult;
        if(b==1){
            return a;
        }
        result = square(a,b/2);
        finalResult = result*result;
        if(b%2==0){
            return finalResult;
        }
        else{
            return a*finalResult;
        }
        
    }
}
