/** 
 * Q. Given a rotated array, find the index of it's pivoted element.
 * 
 * : Used divide & Conquer approach (Binary Search).
 */

public class RBS_Pivot {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 1, 2, 3};
        System.out.println("Pivot element is at: " + search(array, 0, array.length-1));
    }

    static int search(int[] array, int start, int end){
        int mid = end + (start-end)/2;
        if (array[mid]>array[mid+1]) return mid;
        else if(array[0]<array[mid]) return search(array, mid+1, end);
        else return search(array, start, mid-1);
        
    }
}
