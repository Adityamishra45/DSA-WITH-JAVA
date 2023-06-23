// https://leetcode.com/problems/missing-number/
// Missing number - leetcode

import java.util.Scanner;
import java.util.Arrays;
public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,1,4};
        int missing = missingnumber(arr);
        System.out.println("The missing number is : "+missing);
    }
    static int missingnumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];  // Because elements are starting from 0 instead of starting from 1 ,  so the index value will be same as actual value.
            if(arr[i]<arr.length && arr[i]!=arr[correct]) // suppose there are 6 total elements (0,1,2,3,4,5) in the actual array but int the given array 3 ism missing so the array will be (0,1,2,4,5) so the index number of 4 is not eqal to the 4 it is at index number 3 so when we reach at that point we will skip that to find the missing number (arr[i]<arr.length).
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}
