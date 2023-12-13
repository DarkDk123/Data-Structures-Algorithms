/**
 * Creating Custom ArrayList Using Generics now.
 * 
 * Generics allow us to provide a "Generic Type" while creating Classes, Interfaces & methods.
 * It works as a "Place Holder" to the given type.
 * 
 * We can use this type "Generic Type" to declare item at compile time. (based on the allowed operations)
 * 
 * As now, we can do more flexible programming using Generic types with type checking.
 */

// ArrayList Work with all Data Types | Not Primitives.

class CustomArrayList<T> { // Generic type, as place holder of Object data type.

    // Instance variables
    private T[] data; // It's private to restrict direct access. // "T" type object's array
    int size; // current size

    final static int DEFAULT_SIZE = 10;

    // Constructor
    @SuppressWarnings("unchecked")
    CustomArrayList() {
        // We can't create it like this. Compiler doesn't know what to create in memory without knowing "T" actually.
        // data = new T[DEFAULT_SIZE]; // Compile time Error.

        // We we'll use "Object" class, as it's the parent of Everything.
        // So any type given to the Generic, will be a "Object" | 'is-a relationship b/w Child and Parent'
        data = (T[]) new Object[DEFAULT_SIZE]; // Object array.
        size = 0;
    }

    // Add new "int"
    public void add(T item) {

        // Grow size if needed!
        if (isFull()) {
            growSize();
        }

        // Add item
        data[size++] = item;
    }

    // Return last item
    public T remove(){
        if (size == 0) {
            throw new Error("No Element in List to remove!! | Empty List.");
            
        }

        return data[--size];
    }

    // Get 1st index of an item
    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * 
     * @param item Item to find index of.
     * @return Index of the item, or -1 if no such element is present.
     */
    public int index(T item){
        for(int i = 0; i<size; i++) if (data[i].equals(item)) return i; // Used Object.equals to check equality.
        return -1; // Not found
    }

    // Method to get item at specified Position.
    public T get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for ArrayList");
        }
    } 



    // "toString" method to print object.
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
    @SuppressWarnings("unchecked") // suppressing warning
    private final void growSize() {
        final T[] temp = (T[]) new Object[size * 2]; // Double the size.

        for (int i = 0; i < data.length; i++)
            temp[i] = data[i]; // Copy into new array

        this.data = temp;
    }

}


// Runner Code | Main class
public class CustomGenList {
    public static void main(String[] args) {
        CustomArrayList<String> List = new CustomArrayList<>();
        System.out.println(List);
        for (int i = 0; i < 15; i++) {
            List.add(i+2 + " ");
        }

        System.out.println("List after Inserting :\n" + List);
        List.remove();
        List.remove();
        
        System.out.println("After remove 2 items : \n" + List);

        System.out.println("Found 6 at index :" + List.index("6 "));
    }
    
}