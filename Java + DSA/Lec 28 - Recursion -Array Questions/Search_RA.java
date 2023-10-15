/**
 * Q. Given a rotated array, find target element in it.
 *
 * : Used divide & Conquer approach (Binary Search).
 */

public class Search_RA {
    public static void main(String[] args) {
        int[] array = { 5, 6, 7, 8, 1, 2, 3 };
        int res = search(array, 7, 0, array.length - 1);
        System.out.println((res==-1)?"Not Found!!": "Found at Index: " + res);
    }

    static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = end + (start - end) / 2; // mid

        // Target is at the mid.
        if (array[mid] == target) return mid;

        // Mid is in the Left Array.
        if (array[start] <= array[mid]) {
            if (array[start] <= target && array[mid] > target) {
                return search(array, target, start, mid - 1);
            } else
                return search(array, target, mid + 1, end);
        } 
        // Mid is in the Right Array.
        else {
            if (array[start]<=target && array[mid] > target){
                return search(array, target, start, mid-1);
            }else{
                return search(array, target, mid+1, end);
            }

        }
    }
}