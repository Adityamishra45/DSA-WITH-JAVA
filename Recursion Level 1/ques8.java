public class ques8 {
    public static void main(String[] args) {
        int ans = count(100101235);
        System.out.println(ans);
    }
    static int count(int n) {
        return countZeros(n, 0);
    }
    static int countZeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return countZeros(n / 10, ++count);
        } else {
            return countZeros(n / 10, count);
        }
    }
}
