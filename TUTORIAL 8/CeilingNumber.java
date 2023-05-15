import java.util.Arrays;
public class CeilingNumber
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};
        int target = 8;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[]arr ,  int target)
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
        return start; //since the condition is breaking the loop so we are printing the start which is ans.
        
    }
    
}