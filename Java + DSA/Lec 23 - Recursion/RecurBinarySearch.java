/**
 * "I've done this question myself in the Binary Search Lecture, repeating this"
 * 
 * Binary Search Using Recursion
 */
public class RecurBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 15, 23, 45};
        System.out.println("Found at:" + BinarySrecursive(7, array, 0, array.length-1));
        
    }

    // Done Already! Now intutions.
    /**
     * Put Every Variable in arguments that's required for next function call i.e. start, end.
     * 
     * Everything needed just in body keep defining it in the body.
     * 
     * Make sure to Return the recursive func. calls only if the func. has a return value (not void)
     */
    static int BinarySrecursive(int key, int[] array, int start, int end) { 
        if (start <= end) {
            // Placing ascending here cause checking condition "start<=end", then determining Order.
            boolean ascending = array[start] < array[end];
            
            int mid = start + (end - start) / 2;
            if (array[mid] == key)
                return mid;
                
            else if (key < array[mid]) {
                if (ascending)
                    // If the Func has a return value (not void), return the recursive func. call.
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
