public class LinearSearchForMin_and_Max {
    public static void main(String[] args) {
        int[] array = {4,949,4,4,6,47,4,46,49,4,545,4,44,4,477,9,31,31,333659,101};

        int ans = search(array, 2, 8);
        System.out.println(ans);
    }
    static int search (int[] arr , int start , int end)
    {
        int min = arr[start];
        for (int i = start; i <= end; i++) {
            
            if(arr[i]<arr[start])
            {
                min=arr[i];
                
                return min;
            }
        }
        return min;
    }
}


//FIND THE FAULT