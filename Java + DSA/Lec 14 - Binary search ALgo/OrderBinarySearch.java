/**
 * OrderBinarySearch
 */
public class OrderBinarySearch {
    public static void main(String[] args) {
        // Main Function
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arrayDescending = { 10, 8, 7, 6, 4, 1, 0, -1, -12, -23 };
        int key = 4;

        // For Ascending Array.
        int res = SearchBinary(key, array);
        System.out.println(" *1* Binary Search | Ascending Array: "
                + ((res != -1) ? "** Found at index " + res : "** Not Found!!"));

        // For Descending Array.
        res = SearchBinary(key, arrayDescending);
        System.out.println(" *2* Binary Search | Descending Array: "
                + ((res != -1) ? "** Found at index " + res : "** Not Found!!"));
    }

    static int SearchBinary(int key, int[] array) {
        int start = 0;
        int end = array.length - 1;
        boolean ascending = array[start] < array[end]; // Determining Order.

        // loop won't start if array is Empty i.e. (0<-1=false)
        while (start <= end) {
            /*
             * Using this cause same mathematical answer but calculates mid by substraction
             * instead addition ((s+e)/2) to reduce the risk of int overflow.
             */
            int mid = start + (end - start) / 2;// (start + end) / 2;
            if (key == array[mid])
                return mid;
            else if ((key > array[mid])) {
                // Introduced Condition for Order-Agnostic Binary Search.
                if (ascending)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                // Same Condition Checking for Sorting Order.
                if (ascending)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}