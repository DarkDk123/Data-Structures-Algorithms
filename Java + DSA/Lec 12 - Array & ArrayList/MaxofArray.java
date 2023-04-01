public class MaxofArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 12, 51};
        System.out.println("Max of Array is: " + ((max(array)==-1)?"None":max(array)));
    }

    static int max(int[] array){
        if (array.length == 0){
            System.out.println("Empty Array.");
            return -1; // Assuming it doesn't contain -1 as the larges value.
        }
        int max = array[0];
        for (int i : array) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }
}
