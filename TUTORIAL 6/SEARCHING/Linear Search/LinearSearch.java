import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] nums = {54,4,4,4,44,4777,794,4,4,46,1119,8};
        int n = 8;
        System.out.println(search(nums,n));
    }
    // search in the array : return the index if the item found otherwise return -1.

    static int search(int[] arr ,  int n)
    {
        if (arr.length == 0)
        {
            return -1;
        }
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
            {
                return i;
            }
        }

        return -1;

    }

    
}