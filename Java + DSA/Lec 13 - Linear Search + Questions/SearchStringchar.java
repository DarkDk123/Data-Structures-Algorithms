public class SearchStringchar {
    public static void main(String[] args) {

        // Main Functioning
        String str = "Dipesh";
        char key = 'e';

        // Calling methods.
        // By For-i loop.
        int res = searchChar1(key, str);
        System.out.println("Search by For-i loop: Element " + ((res==-1)?"Not Found": "Found at Index " + res));

        // By For-Each loop.
        System.out.println("Search by For-Each loop: Element " + ((searchChar2(key, str))?"Found":"Not Found."));

    }

    // Implementing Character Search in String.

    // Using For-i Loop
    static int searchChar1(char key, String str) {
        for (int index = 0; index < str.length(); index++) {
            if (key == str.charAt(index)) {
                return index;
            }
        }
        return -1;
    }

    // Using For-Each Loop
    static boolean searchChar2(char key, String str) {
        for (char ele : str.toCharArray()) {
            if (key == ele) {
                return true;
            }
        }
        return false;
    }

}
