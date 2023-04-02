
public class LinearSearch {
    public static void main(String[] args) {

    // Array and key element to find in it.
        int[] array = {1, 52, 24, 12};
        int key = 52;
    
    // Main Functioning.
        //Using For-i.
        int result = (LSearch1(key, array));
        System.out.println("\n * Using For-i loop: " + ((result==-1)?"Element not Found": "Element Found at " + result)); // Ternary Operator of Java

        //Using For-each. (returns boolean)
        System.out.println("\n * Using For-Each loop: " + LSearch2(key, array));

        //Using For-each. (returns index)
        Integer res = LSearch2_1(key, array);
        System.out.println("\n * Using For-Each loop (returns Index): Element " + ((res==null)?"Not Found": res + " Found."));

    }

// Implementing Linear search with For-i loop.
    
    /** Docstring trial.
     * @param key   : int Element to found: int
     * @param array int Array to Search in: int[]
     * @return int (index) of found value else -1.
     */

    static int LSearch1(int key, int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key)
                return index;
        }
        return -1;

    }
// Implementing Linear search with For-Each Loop.
// Returns Either True or False.

    static boolean LSearch2(int key, int[] array){

    for (int ele : array) {
    if (ele==key) return true; // Not returning element itself (For "-1" as possible error value.)
    }
    return false; // Won't return -1 cause can conflict with array's element "-1" if present.
    }

// Resolving For-Each possible error with "-1" value.
// And returning element itself instead of boolean. (Using Integer Wrapper Class.)
// Returns null if not found.

    static Integer LSearch2_1(int key, int[] array){
        for (int ele : array) {
            if (ele==key) return ele;
        }
        return null;
    }
}
