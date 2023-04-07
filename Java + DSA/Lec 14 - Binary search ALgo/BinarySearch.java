/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Main Function
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 3;
        int res = SearchBinary(key, array);
        System.out.println((res != -1) ? "** Found at index " + res : "** Not Found!!");
    }

    static int SearchBinary(int key, int[] array) {
        int start = 0;
        int end = array.length - 1;

        // loop won't start if array is Empty i.e. (0<-1=false)
        while (start <= end) {
            /*
             * Using this cause same mathematical answer but calculates mid by substraction
             * instead addition ((s+e)/2) to reduce the risk of int overflow.
             */
            int mid = start + (end-start)/2;//(start + end) / 2;
            if (key == array[mid])
                return mid;
            else if (key > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}