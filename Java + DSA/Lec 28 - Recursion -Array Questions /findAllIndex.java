
/**
 * Q. Implement Linear Search using recursion to find an element.
 * 
 *  We'll use helper function again!! Cause it saves much memory & 
 *  is easy to understand.
 */

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int target = 3;
        int[] array = { 1, 4, 3, 12, 3, 47, 5};
        ArrayList<Integer> ans = search(array, target, 0, new ArrayList<Integer>());
        System.out.println(((ans.size() == 0 ? "Not Found!!" : "Found at Indexes: " + ans)));
    }

    // Linear Search returning indexes as ArrayList;
   // Using helper function
    static ArrayList<Integer> search(int[] array, int target, int index, ArrayList<Integer> list) {
        if (index == array.length)
            return list; // returns empty list if not Found!!

        if (array[index] == target)
            list.add(index);

        return search(array, target, ++index, list);
    }
}
