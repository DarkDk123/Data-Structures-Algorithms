import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        //Arraylist Collection Object.
        ArrayList<Integer> arraylist = new ArrayList<>(10);

        // Adding values on arraylist
        for (int i = 0; i < 5; i++) {
            arraylist.add(i);
        }

        System.out.println(arraylist);
    }
}