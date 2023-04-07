public class RecursiveBinarySearch {
    public static void main(String[] args) {
        // Main Functioning.
        int[] array = { -10, -5, 0, 1, 2, 3, 4, 5, 8, 45, 54, 65 };
        int[] arrayDescending = {10, 8, 7, 6, 4, 1, 0, -1, -12, -23};
        int key = 4;

        // Calling on Ascending Array.
        int res = BinarySrecursive(key, array, 0, array.length - 1);
        System.out.println(" *1* Recursive Binary Search | Ascending Array: "
                + ((res != -1) ? "** Found at index " + res : "** Not Found!!"));

        // Calling on Descending Array.
        res = BinarySrecursive(key, arrayDescending, 0, arrayDescending.length-1);
        System.out.println(" *2* Recursive Binary Search | Descending Array: "
                + ((res != -1)? "** Found at index " + res : "** Not Found!!"));

    }

    static int BinarySrecursive(int key, int[] array, int start, int end) { 
        if (start <= end) {
            // Placing ascending here cause checking condition "start<=end", then determining Order.
            boolean ascending = array[start] < array[end];
            
            int mid = start + (end - start) / 2;
            if (array[mid] == key)
                return mid;
            else if (key < array[mid]) {
                if (ascending)
                    return BinarySrecursive(key, array, start, mid - 1);
                else
                    return BinarySrecursive(key, array, mid + 1, end);
            } else {
                if (ascending)
                    return BinarySrecursive(key, array, mid + 1, end);
                else
                    return BinarySrecursive(key, array, start, mid - 1);
            }
        }

        else
            return -1;
    }
}
