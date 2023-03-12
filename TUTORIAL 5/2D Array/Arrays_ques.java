

//1. Find a peak element which is not smaller than its neighbours.

/*import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
            {
                System.out.println(arr[i]);
            }

        }

    }
}*/

//2. Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
/*public class Arrays_ques
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
//                System.out.println(max);
            }
            if(min>arr[i])
            {
                min  = arr[i];
            }

        }
        System.out.println("Max element is : "+max);
        System.out.println("Min element is : "+min);
    }
}*/

//3. Find the element along with index number 
/*import java.util.Scanner;
import java.util.Arrays;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number which you want to find in the array : ");
        int x = sc.nextInt(); //the number we are trying to search
        for (int i = 0; i < arr.length; i++) {
            if((arr[i])==x)
            {
                System.out.println("This value is there in the array. And the index of the element is : "+i);
            }
        }
    }
}*/
import java.util.Arrays;
public class Arrays_ques
{
    public static void main(String[] args) {
        int[] arr = {8,9,5,6,4};
        swap(arr ,2, 3 );
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1  ,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp ;
    }
}