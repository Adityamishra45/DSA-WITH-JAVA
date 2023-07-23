public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
        for (int i = 0; i <50; i++) {
            System.out.println(fiboformula(i));
        }
    }
static int fiboformula(int n){
    return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
}

    static int fibo(int n){
        if(n<2) //base condition
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);  //recursive call.

        /*First it will call the n-1 which is 7 then it will add with n-2 which is 6. After that it will break 7
         into n-1 and n-2 which 6+5 then it will break 6 into smaller one it will keep continuing untill the base 
         condition is reached. which is 0 and 1 then it will print the ans. See the recursive tree in the notes. */
    }
     
}
