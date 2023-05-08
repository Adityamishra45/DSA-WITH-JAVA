public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int target = 5;
        int ans = floornumber(arr, target);
        System.out.println(ans);
    }
    static int floornumber(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+end-start/2;
            if(target==mid)
            {
                return mid;
            }
            if (target>arr[mid])
            {
                end=mid-1;

            }
            else if(target<arr[mid])
            {
                start=mid+1;
            }
        }
        return end;
    }
}
