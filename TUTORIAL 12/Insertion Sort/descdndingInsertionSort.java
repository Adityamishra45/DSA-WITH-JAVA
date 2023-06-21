import java.util.Arrays;
import java.util.Scanner;

public class descdndingInsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) //we are checking upto length -2 because at first step when i is 0 it is comparing with the 0th and 1st index.
        {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
            
        }
    }
}