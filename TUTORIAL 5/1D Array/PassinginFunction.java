// import java.util.Arrays;

// public class PassinginFunction {
//     public static void main(String[] args) {
//         int[] nums = {644,89,7,4,15};
//         System.out.println("Array before update : "+Arrays.toString(nums));

//         change(nums);
//         System.out.println("Array after update : "+Arrays.toString(nums));
//     }

//     public static void change(int[] arr)
//     {
//         arr[0] = 100;
//     }
// }


import java.util.*;
import java.util.Arrays;
public class PassinginFunction
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[]arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before update : "+Arrays.toString(arr));
        change(arr);
        System.out.println("Array after update : "+Arrays.toString(arr));
    }
        static void change (int[] nums)
        {
            nums[0] = 85;
        }
    
}