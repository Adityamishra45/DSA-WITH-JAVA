import java.util.Scanner;
import java.util.Arrays;
public class normalCyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Now Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        cyclicSort(arr);
        System.out.println("Array after cyclic sort : "+Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct] != arr[i]){
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
