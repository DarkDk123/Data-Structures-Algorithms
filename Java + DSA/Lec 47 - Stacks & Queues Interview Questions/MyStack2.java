/**
 * We have to implement a Stack using a single!
 * 
 * 
 * Let's implement a Stack Using just a single Queue!

 * Complexities!
 * Push - O(1)
 * Pop - O(n)
 * peek - O(n)
 * 
 * Just some improvements because of using a single Queue.
 */

import java.util.LinkedList;
import java.util.Queue;

class MyStack2 {
    Queue<Integer> mainQueue, helperQueue;

    public MyStack2() {
        mainQueue = new LinkedList<>();
    }

    public void push(int x) {
        mainQueue.add(x);
    }

    public int pop() {
        return transfer(mainQueue, true);
    }

    public int top() {
        return transfer(mainQueue, false);
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }

    private int transfer(Queue<Integer> first, boolean remove) {
        int size = first.size();
        while (size!=1) {
            first.add(first.remove());
            size--;
        }

        int ret_ = (remove) ? first.remove(): first.peek();

        if (!remove){
            first.add(first.remove());
        }

        return ret_;
    }
}
