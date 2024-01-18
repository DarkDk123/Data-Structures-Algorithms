package custom;
/**
 * It is dynamic and can grow automatically.
 * Extending Circular Queue to make it dynamic.
 */
public class CustomDynamicCQueue extends CustomCircularQueue{
    
    // Constructors.
    CustomDynamicCQueue(){
        super();
    }

    CustomDynamicCQueue(int size){
        super(size);
    }

    // Implementing additional "growSize" method to increase the array size.
    private void growSize(){
        int[] newArray = new int[size*2];

        for (int i = 0; i < size; i++) {
            newArray[i] = queueArray[(front + i) % queueArray.length];
        }

        // Changing front & end.
        front = 0;
        end = size;

        // Assign new array to actual Queue.
        queueArray = newArray;
    }
    
    // Overriding the insert method to grow size automatically!
    @Override
    public boolean insert(int val) {
        // Grow size if necessary.
        if (isFull()) growSize();

        // Call actual insert method.
        return super.insert(val);
    }

    // Runner method.
    public static void main(String[] args) {
        CustomDynamicCQueue myQueue = new CustomDynamicCQueue(11);

        System.out.println("Adding 15 elements to queue.");
        for (int i = 0; i < 14; i++) {
            myQueue.insert(i);
        }

        // It will increase size automatically
        myQueue.insert(77);

        System.out.println("Printing queue : " + myQueue);


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
