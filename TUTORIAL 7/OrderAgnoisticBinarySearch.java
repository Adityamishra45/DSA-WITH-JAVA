import java.util.Scanner;

public class OrderAgnoisticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int [] arr = {5,8,9,45,46,150,200,890,10101};
        int[]arr = {10101,890,200,150,46,45,9,8,5};
        int target = 200;
        
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[]arr , int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int middle = start+(end-start)/2;
            if(arr[middle]==target)
            {
                return middle;
            }

            else if(arr[start]<arr[end]) {
                if(target>arr[middle]) {
                    start = middle+1;
                }
                else{
                    end = middle-1;
                }
            }
                    
            else if(arr[start]>arr[end])
            {
                if(target>arr[middle])
                {
                    end = middle-1;
                }
                else
                {
                    start = middle+1;
                }
                
            }
        }
        return -1;
    }
}
