import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {644,89,7,4,15};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(nums);
    }

    public static void change(int[] arr)
    {
        arr[0] = 100;
    }
}
