import java.util.*;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] arr = new int[5];
        arr[0]=  23;
        arr[1] = 60;
        arr[2] = 66;
        arr[3] = 610;
        arr[4] = 70;

        // // System.out.println(arr[0]);

        // //input using for loop

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        //or

        System.out.println(Arrays.toString(arr));  // will print the array in the form of strings.

        // for(int num:arr) //for every element in the array  , print the element.
        // {
        //     System.out.println(num+" ");  // here num represents element of the array.
        // }
        // System.out.println();
    }
    
}
