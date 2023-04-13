import java.util.Arrays;

public class LinearSearchin2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {8,9,10,11},
                {12,13,1,4,15}};
        int target = 11;
        int[] ans  = search(array, target);
        System.out.println(Arrays.toString(ans)); 
    }
    static int[] search (int[][] arr  , int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
        
    }
}
