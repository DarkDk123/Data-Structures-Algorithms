
/**
 * We have to implement a Stack using Queues!!
 * 
 *          Complexities!
 * Push - O(1)
 * Pop - O(n) - amortized
 * peek - O(n) - amortized
 */

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> mainQueue, helperQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        helperQueue = new LinkedList<>();
    }

    public void push(int x) {
        if (!helperQueue.isEmpty()) {
            helperQueue.add(x);
        } else {
            mainQueue.add(x);
        }
    }

    public int pop() {
        if (!helperQueue.isEmpty()) {
            return transfer(mainQueue, helperQueue, true);
        }

        else {
            return transfer(helperQueue, mainQueue, true);
        }
    }

    public int top() {
        return (!helperQueue.isEmpty()) ? transfer(mainQueue, helperQueue, false)
                : transfer(helperQueue, mainQueue, false);
    }

    public boolean empty() {
        return helperQueue.isEmpty() && mainQueue.isEmpty();
    }

    private int transfer(Queue<Integer> first, Queue<Integer> second, boolean remove) {
        while (second.size() != 1) {
            first.add(second.remove());
        }

        int ret_ = (remove) ? second.remove() : second.peek();

        if (!remove)
            first.add(second.remove());

        return ret_;
    }
}