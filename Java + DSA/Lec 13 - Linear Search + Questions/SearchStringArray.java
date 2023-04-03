/**
 * Same as Before Search Functions.
 * But for Strings this time.
 */

public class SearchStringArray {
    public static void main(String[] args) {
        // String Array and key element to find in it.
        String[] array = {"apple", "banana", "cherry", "date"};
        String key = "banana";
        // Main Functioning.
    
        // Using For-i.
        int result = LSearch1(key, array);
        System.out.println("\n * Using For-i loop: " + ((result == -1) ? "Element not Found" : "Element Found at " + result)); // Ternary Operator of Java

        // Using For-each. (returns boolean)
        System.out.println("\n * Using For-Each loop: " + LSearch2(key, array));
    }

    // Implementing Linear search with For-i loop.
    static int LSearch1(String key, String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(key))
                return index;
        }
        return -1;
    }

    // Implementing Linear search with For-Each Loop.
    // Returns Either True or False.
    static boolean LSearch2(String key, String[] array) {
        for (String ele : array) {
            if (ele.equals(key))
                return true;
        }
        return false;
    }
}
