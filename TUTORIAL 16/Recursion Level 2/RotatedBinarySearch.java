public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5, 8, 9};
        int target = 8;
        int n = arr.length - 1;
        System.out.println(Rotatedsearch(arr, target, 0, n));
    }
    static int Rotatedsearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // If the left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return Rotatedsearch(arr, target, start, mid - 1);
            } else {
                return Rotatedsearch(arr, target, mid + 1, end);
            }
        }

        // If the right half is sorted
        if (target >= arr[mid] && target <= arr[end]) {
            return Rotatedsearch(arr, target, mid + 1, end);
        }

        // Recurse on the unsorted part of the array
        return Rotatedsearch(arr, target, start, mid - 1);
    }
}
