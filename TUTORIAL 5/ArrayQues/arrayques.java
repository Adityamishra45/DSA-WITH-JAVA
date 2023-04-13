import java.util.ArrayList;
import java.util.Scanner;

public class arrayques
{
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        Scanner sc = new Scanner (System.in);
        int target = sc.nextInt();
        System.out.println(wealth(arr,target));

    }
    static int wealth(int[]arr, int target)
    {
        ArrayList ar = new ArrayList();
        // int ans =0; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                ar.add(i);
               
            }
        }
        
        System.out.print(ar.get(0)+" ");
            int last = (int) ar.get(ar.size() - 1);
            // System.out.println(last);
        return last;
        
    }
}
