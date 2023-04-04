/**
 * GenericLsearch Implements a LinearSearch Function that can work with different DataTypes.
 * @warning It can't be used with Primitive types i.e. int, float etc.
 * Instead It can be used with Primitive Wrapper Classes.
 */

public class GenericLSearch {
    // Creating a Linear Search Using Generics.
    // It can work with any Data-Type. (Not primitives)
    // Implementing Only the for-i loop version of Search

    public static <T> int GenericLinearSearch(T key, T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i; // return the index where the key was found
            }
        }
        return -1; // return -1 if the key was not found
    }

    public static void main(String[] args) {
        // Integer array and element to found.
        Integer intEle = 32;
        Integer[] intArray = { 1, 54, 21, 10, 32, 65 };

        // String array and element to found.
        String strEle = "IP";
        String[] StrArray = { "DIPESH", "IP", "NO", "SE" };

        // Calling Generic Search Function with different Objects only (Not Primitives)

        System.out.println("Integer Search: "
                + ((GenericLinearSearch(intEle, intArray) == -1) ? "Not Found" : "Found at " + GenericLinearSearch(intEle, intArray)));

        System.out.println("String Search: "
                + ((GenericLinearSearch(strEle, StrArray) == -1) ? "Not Found" : "Found at " + GenericLinearSearch(strEle, StrArray)));

    }
}

