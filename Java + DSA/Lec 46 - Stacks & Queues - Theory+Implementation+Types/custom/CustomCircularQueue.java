package custom;

/**
 * Implementing Circular Queue using array.
 * It will be Imaginary connected like a circle.
 */
public class CustomCircularQueue{
    
    protected int[] queueArray;
    private static final int DEFAULT_SIZE = 10;
    
    protected int end = 0; // End where insertion happens.
    protected int front = 0; // Starts here.
    protected int size = 0; // Size of the Queue.
    

    // Constructor with sie parameter.
    CustomCircularQueue(int size){
        if (size < 0) size = DEFAULT_SIZE; // Just safeguard negative values. | It can have size "0"; 
        queueArray = new int[size];
    }

    // Empty Constructor
    CustomCircularQueue(){
        this(DEFAULT_SIZE);
    }

    // Is full!
    protected boolean isFull() {
        return size==queueArray.length;
    }

    // Is queue empty!
    protected boolean isEmpty() {
        return size == 0;
    }

    // Insertion | Happens at the End.
    // We'll keep increasing end.
    // If it becomes greater than size of array.
    // For this we'll have end%size while inserting values to keep it in index.
    public boolean insert(int val) {
        if (isFull())
            throw new Error("Queue Full: Cannot add more elements!!");
        
        queueArray[end++] = val;

        // Make end in range & increment size.
        end %= queueArray.length;
        size++;
        return true;
    }


    // Deletion | Happens from front position.
    
    public int delete() {
        if (isEmpty()) {
            throw new Error("Empty Queue: Cannot delete!!");
        }

        int removed = queueArray[front++];
        
        // Make front in range & decrement size.
        front %= queueArray.length;
        size--;
        return removed;
    }

    // Display the item at the Front.

    public int seekFront() {
        // While it's not suggested to throw Errors for smaller problems.
        // We can use well handled Exceptions here.
        if (isEmpty())
            throw new Error("Empty Queue: Cannot seek front!!");

        return queueArray[front];
    }

    // Display the Queue.
    @Override
    public String toString() {
        if (queueArray == null)
            return "[Empty Queue]";

        StringBuilder sb = new StringBuilder("Queue : [");

        for (int i = 0; i < size; i++) {
            if (i == size-1)
                return sb.append(queueArray[(front+i)%queueArray.length] + "]").toString();
            sb.append(queueArray[(front+i)%queueArray.length] + ", ");
        }

        return "[Empty Queue]";
    }

    // Runner method.
    public static void main(String[] args) {
            CustomCircularQueue myQueue = new CustomCircularQueue();
            
            System.out.println("Adding 10 elements to queue.");
            for (int i = 0; i < 10; i++) {
                myQueue.insert(i);
            }

            System.out.println("Printing queue : " + myQueue);

            // Adding more will raise Error!!

            // myQueue.insert(77);

            // Removing 5 elements in FIFO or LILO order.
            System.out.println("Removing 5 elements | Will follow FIFO order.");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Deletion %d : ".formatted(i) + myQueue.delete());
            }

            // Printing after removal
            System.out.println("Our queue now : " + myQueue);

            // Let's seek Front after deleting an element.
            myQueue.delete();
            System.out.println("After deleting one more element, the item at front is : " + myQueue.seekFront());

            // delete rest elements
            for (int i = 0; i < 4; i++) {
                System.out.println("Removed : " + myQueue.delete());
            }

            System.out.println("Now, Queue is : " + myQueue);

            // If we remove more it will raise an Error!
            // Below lines will throw error cause the Queue is Empty.

            // myQueue.seekFront();
            // myQueue.delete();
    }

}
