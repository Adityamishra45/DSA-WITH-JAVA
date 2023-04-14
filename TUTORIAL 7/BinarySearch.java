import java.util.Arrays;
public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr = {-5,8,9,15,56,78,79,99,100};
        int target = 78;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr ,  int target)
    {
        // First we need to find the middle element;
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else{
                return mid;
            }
           
        }
        return -1;
        
    }
    
}