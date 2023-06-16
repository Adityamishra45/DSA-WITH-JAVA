//For descending order.

import java.util.Arrays;
import java.util.Scanner;

public class selectionsorting {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int [size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        System.out.println("The Sorted array is : "+Arrays.toString(arr));
    }
     static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) //since we need do the comparison so we will check only upto second last element of the array. and j will go upto last element.
        {  
            int max = i;
            for (int j = i+1; j < arr.length; j++) { //when i=0 then j will be 1 so will compare that.
                if(arr[j]>arr[max]){
                    max = j; // finding the minimum element.
                }
            }
            int temp = arr[max];  // since the value of min has been updated so we are swapping it with i , at each element.
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
}
