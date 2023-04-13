// import java.util.*;
// public class EvenDigits
// {
//     public static void main(String[] args) {
//         int[] arr = {48,46166,3326,9613,65530};
//         // boolean ans  = even(6642115); // it will return the whether the condition is true or not.
//         int ans = countDigit(86547); // It will count the number of digits.
//         System.out.println(findnumbers(arr)); // will print the number of digits in the given number.
//     }
//     // static int numbers (int[] num)
//     // {
//     //     int ans = countDigit(num);
//     //     return -1;
//     // }
//     static int findnumbers(int[] arr)
//     {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if(even(arr[i])){
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean even (int num) // Function to check whether the number contains the even number or not.
//     {
//         int ans = countDigit(num);
//         if(ans%2==0)
//         {
//             return true;
//         }
//         return false;
//     }
//     static int countDigit(int num) //Function to count the numer of digits in the given number.
//     {
//         int count=0;
//         while(num>0)
//         {
//             count ++;
//             num = num/10;
//         }
//         return count;
//     }
// }




// same code but in fresh manner:- 

import java.util.*;
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {48, 46166, 3326, 9613, 65530};
        System.out.println(findnumbers(arr));
    }

    static int findnumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int ans = countDigit(num);
        if (ans % 2 == 0) {
            return true;
        }
        return false;
    }

    static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
