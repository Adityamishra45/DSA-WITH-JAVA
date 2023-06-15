//For descnding order

import java.util.*;

public class bubblesorting {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        bubble(array);
        System.out.println("Your sorted array is : "+Arrays.toString(array));
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
