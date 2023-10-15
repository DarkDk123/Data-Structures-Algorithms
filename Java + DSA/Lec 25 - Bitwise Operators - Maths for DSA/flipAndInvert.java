/** "Google Interview Question"
 * Q. Given n x n binary matrix, flip the image horizontally and then invert it.
 * 
 *  fliping horizontally means = Reversing the inner array.
 *  inverting it means = flipping the bits in it (0 to 1 | 1 to 0).
 * 
 */
import java.util.Arrays;

public class flipAndInvert {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 1}
        };
        
        System.out.println("The previous Image is " + Arrays.deepToString(image)); 
        System.out.println("The Flip & Inverted Array is : " + Arrays.deepToString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image){
        // Looping through each array of the array
        for (int innerArr = 0; innerArr < image.length; innerArr++) {
            int[] subArray = image[innerArr]; // inner array as subArray.

            // Reversing the array
            int start = 0;
            int end = subArray.length -1;
            while (start<=end){
                // Swapping the elements and flipping it.
                int temp = (subArray[start])^1;
                subArray[start] = (subArray[end]^1);
                subArray[end] = temp;

                start++; end--;
            }
        }

        return image;
    }
}
