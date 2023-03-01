//Q:-  Take an array as input from the user, search for the given number X and print the index on which it occurs.

import java.util.Scanner;
import java.util.Arrays;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number which you want to find in the array : ");
        int x = sc.nextInt(); //the number we are trying to search
        for (int i = 0; i < arr.length; i++) {
            if((arr[i])==x)
            {
                System.out.println("This value is there in the array. And the index of the element is : "+i);
            }
        }
    }
}
