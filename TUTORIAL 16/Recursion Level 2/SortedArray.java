import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = sort(arr, 0);
        System.out.println(isSorted);
        sc.close();
    }

    static boolean sort(int[] arr, int i) {
        if (arr.length == 0 || i == arr.length - 1) {
            return true;
        }     
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        
        return sort(arr, i + 1);
    }
}
