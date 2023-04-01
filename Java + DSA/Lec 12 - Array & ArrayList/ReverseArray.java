import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array Before: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Array After Reverse: " + Arrays.toString(array));

    }

    static void reverseArray(int[] array){
        int start = 0, end = (array.length-1);

        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end]=temp;
            start++;end--;
        }
    }
}
