import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr , int low , int high){
          if(low>=high){
            return;
          }
          int s = low;
          int e = high;
          int m = s+(e-s)/2;
          int pivot = arr[m];

          while(s<=e){
            // also a reson why if its already sorted it will not swap
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
          }
          // now my pivot is at corrext index please sort two halves now.
          quick(arr, low,e);
          quick(arr, s, high);
    }
}