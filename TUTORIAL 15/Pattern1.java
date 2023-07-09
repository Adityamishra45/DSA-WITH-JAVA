public class Pattern1{
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);;
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        patter11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern31(4);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <=i; j++) {
                System.out.print("* ");
             }
             // when one row is printed we need to add new line.
             System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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

    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();   
        }
    }

    static void pattern5(int n){
        for (int i = 1; i < 2*n; i++) {
            if(i<=n)  //If the number of coloumn is equal to row just print normally.
            {
                for (int j = 1; j <=i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
            else // when the no of rows exceeds the length of n then substract the rows from the (2*n). For example if the row is 6 and the value of n is 5 then (2*n) will be and when we will decrese it then the ans will be 4 and that many stars we need to print in that coloumn */
            {
                for (int j = 1; j <=2*n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }  
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    static void pattern7(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern10(int n){
        for (int i = 0; i<n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patter11(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();    
        }
    }

    static void pattern12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+" ");
            }
            for(int j =2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
    
    static void pattern31(int n){
        int original = n;
        n=2*n;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                int atEveryIndex = original-Math.min(Math.min(i,j), Math.min(n-i , n-j));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }
}
