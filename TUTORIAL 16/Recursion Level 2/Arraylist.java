import java.util.*;
public class Arraylist {
   public static void main(String[] args) {
    int [] arr = {5,6,64,66,1,1,1,1};
    int target = 1;
    findAllIndex(arr, target, 0);
   } 
   static ArrayList<Integer> findAllIndex(int[] arr , int target , int i){
    ArrayList<Integer> list = new ArrayList<>();
    if(i==arr.length){
        return list;
    }
    if(arr[i]==target){
        list.add(i);
    }
    ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, i+1);
    list.addAll(ansFromBelowCalls);
    return list;
   }
}
