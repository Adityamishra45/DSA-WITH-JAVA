import java.util.ArrayList;
public class LinearSearchMultipleOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,4,5,1,2,6,4,5,1,51};
        int target = 5;
        search(arr, target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr , int target , int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        search(arr, target, i+1);
    }
}
