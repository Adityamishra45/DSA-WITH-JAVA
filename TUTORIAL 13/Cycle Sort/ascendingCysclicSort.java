
//This cyclic sort handles both the case whether the input starts from 0 or starts from 1.

import java.util.*;
public class ascendingCysclicSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of theS array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int min = arr[0]; // Assume the first element as the minimum value
        for (int i = 1; i < arr.length; i++) {  // Find the minimum value in the array
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-min;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}