public class SearchInRange {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = {5, 2, 4, 1, 3, 8, 12, 20, 31, 0};
        int key = 3, start = 2, end = 6;

        // Calling methods.
        // By For-i loop.
        int res = LSearchRange(key, array, start, end);
        System.out.println("Search in Range: Element " + ((res==-1)?"Not Found": "Found at Index " + res + " in given Range."));
}

    static int LSearchRange(int key, int[] array, int start, int end) {
        if (array.length==0) return -1;
        
        for (int index = start; index <= end; index++) {
            if (array[index]==key) return index;
        }
        return -1;
    }
}
