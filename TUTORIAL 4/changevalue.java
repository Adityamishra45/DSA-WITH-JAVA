import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
       
        // create an array

        int[] arr = { 1,2,54,5,64};
        changes(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void changes(int[] nums)
    {
        nums[0] = 90;  //if you make a change to the object via this refrence variable ,  same object will be changed.
        
    }
}
