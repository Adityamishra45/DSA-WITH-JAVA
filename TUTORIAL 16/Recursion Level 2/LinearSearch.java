public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,3,4,26,89,45};
        int target = 26;
        System.out.println(search(arr, target, 0));
    }
    static int search(int[] arr , int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return search(arr,target, i+1);
    }
}
