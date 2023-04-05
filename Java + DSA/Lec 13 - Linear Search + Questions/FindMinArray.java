import java.util.Arrays;
public class FindMinArray {
    public static void main(String[] args) {
        // Main Functioning
        int[] array = { 1, 4, 5, -2, 1, -5 };

        // Calling Created Method.
        int res = min(array);
        System.out.println(res + " is the Minimum of " + Arrays.toString(array));
    }

    // Minimum Integer using For-Each Loop.
    static int min(int[] array) {
        if (array.length == 0) {
            System.out.println(" * Empty Array!!");
            return 0;
        }
        
        int min = array[0];
        for (int ele : array) {
            if (ele < min)
                min = ele;
        }
        return min;
    }
}
