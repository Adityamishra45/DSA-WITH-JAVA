import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionArray {

    public static void main(String[] args) {
        // int[][] arr = new int[3][3];
        // arr[0][0] = 8;
        // arr[0][1] = 60;
        // System.out.println(arr[0][1]);
                //OR
        // int[][] arr = {{511,8,1,8},{5448,48,655,4},{4844,449,4,949494,44,4}};
        // System.out.println(arr[0][2]);

        Scanner sc = new Scanner (System.in);
        // Taking input
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            //for each col in every row
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
