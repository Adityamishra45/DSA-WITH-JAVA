import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (palindromeNumber(n)) {
            System.out.println("It's a palindrome number.");
        } else {
            System.out.println("It's not a palindrome number.");
        }
        sc.close();
    }
    static boolean palindromeNumber(int n) {
        return n == rev(n);
    }

    static int sum = 0;

    static int rev(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev(n / 10);
    }
}
