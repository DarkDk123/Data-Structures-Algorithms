/**
 * Q. Implement Linear Search using recursion to find an element.
 * 
 *  We'll use helper function again!! Cause it saves much memory & 
 *  is easy to understand.
 */

public class linearSRecur {
    public static void main(String[] args) {
        int target = 3; int[] array = {1, 4, 0, 12, 47, 5, 3};
        int ans = search(array, target, 0);
        System.out.println(((ans==-1?"Not Found!!": "Found at Index: " + ans)));
    }

    // Linear Search returning index.
    // Direct implement helper function.
    static int search(int[] array, int target, int index){
        if (index==array.length) return -1;

        if (array[index]==target) return index;

        return search(array, target, ++index);
    }
}
