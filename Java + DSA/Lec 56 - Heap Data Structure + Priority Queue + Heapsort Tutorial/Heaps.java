/**
 * Heaps - A data structure storing items in a tree structure, with the property
 * that the
 * value of any node is greater (smaller) than or equal to the values of its
 * children.
 * 
 * Heaps are perfect for managing tasks requiring quick access to the
 * highest/lowest priority items. (or other criteria)
 */

public class Heaps {
    // Runner Code
    public static void main(String[] args) {
        MinHeap<Integer> heap = new MinHeap<Integer>(new Integer[] { 1, 2, 3, 45, 2, 43, 5, 65, 3 });

        while (heap.size() > 0) {
            System.out.print(heap.pop() + ", ");
        }
    }
}

class MinHeap<T extends Comparable<T>> {
    // Initial values
    private int size;
    private int capacity;
    private T[] array; // Using Efficient array representation of the heap!

    @SuppressWarnings("unchecked") // For object[] to T[]
    public MinHeap(int capacity) {
        // Initialize heap with capacity!
        array = (T[]) new Comparable[capacity]; // I learned that when got error!!
        this.capacity = capacity;
        size = 0;
    }

    // Constructor with input array
    @SuppressWarnings("unchecked") // For object[] to T[]
    public MinHeap(T[] array) {
        capacity = array.length;
        size = 0; // Total elements in the heap
        this.array = (T[]) new Comparable[array.length];

        // Now build from given array
        buildHeap(array);
    }

    // Build from array
    public boolean buildHeap(T[] array) {
        // Push all elements to the heap
        
        // for (T e : array) {
        //     push(e);
        // }
        
        // Using Heapify | O(n)
        this.array = array;
        heapify(array);
        size = array.length;

        return true;
    }

    // Push to heap
    public void push(T val) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full!");
        }

        array[size++] = val;

        upHeap(size - 1);
    }

    private void upHeap(int index) {
        // Get parent
        int parentIndex = getParent(index);

        // If we're done
        if (parentIndex == -1 || array[parentIndex].compareTo(array[index]) < 0) {
            return;
        }

        // Swap
        swap(index, parentIndex);
        upHeap(parentIndex);
    }

    // Pop from heap
    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty!");
        }

        // Replace values
        T val = array[0];
        array[0] = array[size - 1];
        array[size - 1] = null;
        size--;

        downHeap(0);

        return val;
    }

    private void downHeap(int index) {
        // Get smallest child
        int left = getLeft(index);
        int right = getRight(index);

        int smallestChildIndex;
        if (left == -1 || right == -1) {
            smallestChildIndex = (left == -1) ? right : left;
        } else {
            smallestChildIndex = (array[left].compareTo(array[right]) < 0) ? left : right;
        }

        // If we're done
        if (smallestChildIndex == -1 || array[index].compareTo(array[smallestChildIndex]) < 0) {
            return;
        }

        // Swap
        swap(index, smallestChildIndex);
        downHeap(smallestChildIndex);
    }

    public int size() {
        return size;
    }
    
    public void heapify(T[] array) {
        this.array = array;
        this.size = array.length;

        // Heapify entire array
        for (int i = (size / 2) - 1; i >= 0; i--) {
            downHeap(i);
        }
    }

    // Getting parent, left & right nodes with indexes
    // We're working with 0-index array

    private int getParent(int index) {
        // No Parent
        if (index <= 0) {
            return -1;
        }

        return (index - 1) / 2;
    }

    private int getLeft(int index) {
        int left = (2 * index) + 1;
        return (left < size) ? left : -1;
    }

    private int getRight(int index) {
        int right = (2 * index) + 2;
        return (right < size) ? right : -1;
    }

    // Swap
    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}