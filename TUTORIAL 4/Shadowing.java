public class Shadowing {
    static int x = 90;  /*We can use this x in etire code and in ehole body. but this will be shadowed at line 5*/ 
    public static void main(String[] args) 
    {
         System.out.println(x);
         int x = 40;
         System.out.println(x);
    }
}
