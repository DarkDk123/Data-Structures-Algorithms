/**
 * Creating Custom ArrayList with suitable methods.
 * 
 * This custom list is for only int type, even if we want it 
 * to work for multiple types, we'll have to change "Almost 90%" of the code.
 * 
 * That's why this dependency of Our List on a single data type isn't reliable.
 * 
 * We'll solve this problem using "Generics";
 */

// ArrayList specific to "int" Data type.
class CustomArrayList {

    // Instance variables
    private int[] data; // It's private to restrict direct access.
    int size; // current size

    final static int DEFAULT_SIZE = 10;

    // Constructor
    CustomArrayList() {
        data = new int[DEFAULT_SIZE];
        size = 0;
    }

    // Add new "int"
    public void add(int item) {

        // Grow size if needed!
        if (isFull()) {
            growSize();
        }

        // Add item
        data[size++] = item;
    }

    // Return last item
    public int remove(){
        if (size == 0) {
            System.out.println("No element in List to remove!!");
            return -0;
        }

        return data[--size];
    }

    // Get 1st index of an item
    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * 
     * @param item Item to find index of (int)
     * @return Index of the item, or -1 if no such element is present (int)
     */
    public int index(int item){
        for(int i = 0; i<size; i++) if (data[i]==item) return i;
        return -1; // Not found
    }

    @Override
    public String toString() {
         if (data == null)
            return "null List";

        int iMax = size - 1;
        if (iMax == -1)
            return "CustomArrayList { [] }";

        StringBuilder b = new StringBuilder();
        b.append("CustomArrayList { [");
        for (int i = 0; ; i++) {
            b.append(String.valueOf(data[i]));
            if (i == iMax)
                return b.append("] size = %d}".formatted(size)).toString();
            b.append(", ");
        }
    }

    // Helping methods

    // Is List Full??
    private boolean isFull() {
        return size == data.length;
    }

    // Grow size to double.
    private final void growSize() {
        final int[] temp = new int[size * 2]; // Double the size.

        for (int i = 0; i < data.length; i++)
            temp[i] = data[i]; // Copy into new array

        this.data = temp;
    }

}


// Runner Code | Main class
public class CustomListExample {
    public static void main(String[] args) {
        CustomArrayList List = new CustomArrayList();
        System.out.println(List);
        for (int i = 0; i < 15; i++) {
            List.add(i+2);
        }

        System.out.println("List after Inserting :\n" + List);
        List.remove();
        List.remove();
        
        System.out.println("After remove 2 items : \n" + List);

        System.out.println("Found 6 at index :" + List.index(6));
        System.out.println("Found 0 at index :" + List.index(0));
    }
    
}