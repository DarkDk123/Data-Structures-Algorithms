package custom;

/**
 * Implementing a Custom Queue.
 * Using two pointer i.e. "front & rear" is an Easy approach.
 * We'll implement Queue using single pointer. (tricky way).
 * 
 * 
 * We won't use "Generics" to allow all Object types.
 * Instead We're just making it for "int" data type only.
 */

public class MyCustomQueue {
    // Runner method.
    public static void main(String[] args) {
        CustomQueue myQueue = new CustomQueue();

        System.out.println("Adding 10 elements to queue.");
        for(int i = 0; i < 10; i++){
            myQueue.insert(i);
        }

        System.out.println("Printing queue : " + myQueue);

        // Adding more will raise Error!!
        
        // myQueue.insert(77);
        
        // Removing 5 elements in FIFO or LILO order.
        System.out.println("Removing 5 elements | Will follow FIFO order.");
        for (int i = 1; i <=5; i++) {
            System.out.println("Deletion %d : ".formatted(i) + myQueue.delete());
        }

        // Printing after removal
        System.out.println("Our queue now : " + myQueue);

        // Let's seek Front after deleting an element.
        myQueue.delete();
        System.out.println("After deleting one more element, the item at front is : " + myQueue.seekFront());

        // delete rest elements 
        for(int i = 0; i < 4; i++) {
            System.out.println("Removed : " + myQueue.delete());
        }
        
        System.out.println("Now, Queue is : " + myQueue);

        // If we remove more it will raise an Error!
        // Below lines will throw error cause the Queue is Empty.

        // myQueue.seekFront();
        // myQueue.delete();
    }
}


class CustomQueue{
    protected int[] queueArray;
    protected int end; // End where insertion happens.
    private static final int DEFAULT_SIZE = 10;


    // Constructor with sie parameter.
    CustomQueue(int size){
        if (size < 0) size = DEFAULT_SIZE; // Just safeguard negative values. | It can have size "0"; 
        queueArray = new int[size];
        end = 0;
    }

    // Empty Constructor
    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    // Is full!
    protected boolean isFull(){
        return end==queueArray.length;
    }   

    // Is queue empty!
    protected boolean isEmpty(){
        return end==0;
    }

    // Insertion | Happens at the End.
    public boolean insert(int val){
        if (isFull()) throw new Error("Queue Full: Cannot add more elements!!");
        queueArray[end++] = val;
        return true;
    }

    // Deletion | Happens from front i.e. index 0.
    // We'll move every item to one place ahead in the queue.

    public int delete(){
        if (isEmpty()){
            throw new Error("Empty Queue: Cannot delete!!");
        }

        int removed = queueArray[0];
        for(int i = 1; i < end; i++){
            queueArray[i-1] = queueArray[i];
        }
 
        end--; // Removed one element;
        return removed;
    }

    // Display the item at the Front.

    public int seekFront(){
        // While it's not suggested to throw Errors for smaller problems.
        // We can use well handled Exceptions here.
        if (isEmpty()) throw new Error("Empty Queue: Cannot seek front!!");

        return queueArray[0];
    }

    // Display the Queue.
    @Override
    public String toString() {
        if (queueArray == null) return "[Empty Queue]";
        
        StringBuilder sb = new StringBuilder("Queue : [");

        for(int i = 0; i < end; i++){
            if (i==end-1) return sb.append(queueArray[i] + "]").toString();
            sb.append(queueArray[i] + ", ");
        }

        return "[Empty Queue]";
    }
}
