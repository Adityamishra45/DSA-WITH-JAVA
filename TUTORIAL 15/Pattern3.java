public class Pattern3{
    public static void main(String[] args) {
        pattern3(5);
    }     
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i+1; j++) //If we will not reduce the i then in each there will be same no of stars in the each row and we are adding 1 because i is starting from 1 not from 0. 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}