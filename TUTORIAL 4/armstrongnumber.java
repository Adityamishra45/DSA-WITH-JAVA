
/*Check armstrong number */


// import java.util.Scanner;

// public class armstrongnumber {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner (System.in);
//         // int n = sc.nextInt();
//         // armstrong(n);

//         for (int i = 100; i < 1000; i++) {
//             if(armstrong(i)){
//                 System.out.println(i+ " ");
//             }
//         }
//     }

//     public static void armstrong (int n)
//     {
//         int sum = 0;
//         int original = n;
        
//         while(n>0)
//         {
//            int rem = n%10;
//            sum = sum+rem*rem*rem;
//            n = n/10;
//         }
//         if (sum==original)
//         {
//             System.out.println("Armstrong number");
//         }
//         else{
//              System.out.println("invalid");

//         }
        
//     }
// }

 



/*All the three digit armstrong number. */


import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // armstrong(n);

        for (int i = 100; i < 1000; i++) {
            if(armstrong(i)){
                System.out.println(i+ " ");
            }
        }
    }

     static boolean armstrong (int n)
    {
        int sum = 0;
        int original = n;
        
        while(n>0)
        {
           int rem = n%10;
           sum = sum+rem*rem*rem;
           n = n/10;
        }
        if (sum==original)
        {
            return true;
            //System.out.println("Armstrong number");
        }
        else{
            return false;
        }
        
    }
}

