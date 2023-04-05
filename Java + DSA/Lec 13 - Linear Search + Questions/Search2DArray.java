public class Search2DArray {
    public static void main(String[] args) {         
        // Main 
        int[][] array2d = {
            {2, 5, 1, 3},
            {12, 15, 11, 13, 52},
            {10, 21, 25, 19}
        };

        // Calling the Method.  
        String res = search2dArray(array2d, 52);
        System.out.println("Search in 2D Array: " + ((res==null)?"Not Found!!":res));

    }

//  Using For-i Loop -> String
    static String search2dArray(int[][] array2d, int key){
        for (int ar_index = 0; ar_index < array2d.length; ar_index++) {
            int[] array1d = array2d[ar_index];
            for (int index = 0; index < array1d.length; index++) {
                if (array1d[index]==key) return String.format("Found at Array[%d][%d].", ar_index, index);
            }
        }
        return null;
    }
}
