//For ascending order
import java.util.*;
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,8,6,1,3};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) //Decreasing the value of i because at each pass we are having the biggest element in the end.
            {
                if(arr[j]<arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp; 
                }
            }
        }
    }
}