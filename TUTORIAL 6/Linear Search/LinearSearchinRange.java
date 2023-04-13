
public class LinearSearchinRange {
    public static void main(String[] args) {
       int[] array={45,25,12,86,99,98,101}; 
       int target = 12;
       int ans = search(array, target, 1, 4);
       System.out.println(ans);
    }
    static int search(int[] arr , int target , int start  ,int end)
    {
        for (int i = start; i <= end; i++) {
            if(arr[i]==target)
            {
                return i;
            }
            
        }
        return -1;
        
    }
}
