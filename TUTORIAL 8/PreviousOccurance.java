import java.util.*;
public class PreviousOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the element of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("enter target element : ");
        int target=sc.nextInt();
        int result = binarySearch(arr, target);

        if(result == 0){
            System.out.println("not");
        }
        else{
            System.out.println(""+result);
        }
        sc.close();

    }
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end= arr.length-1;
        int result = 0;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
             {
                result = mid;

                end=mid-1;
             }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
        }
        return result;

    }
    
}
