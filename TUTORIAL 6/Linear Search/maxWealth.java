public class maxWealth
{
    public static void main(String[] args) {
        int[][] arr = {{45,78,45},{4,25,78},{100,100}};
        System.out.println(wealth(arr));
    }
    static int wealth(int[][] arr)
    {
        int ans =0;  //initializing the ans as 0.
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; //adding the new values to sum for each value in perticular array.
            }
            if(sum>ans) //applying the condition
            {
                ans = sum;
            }
        }
       
        
        return ans;
    }
}