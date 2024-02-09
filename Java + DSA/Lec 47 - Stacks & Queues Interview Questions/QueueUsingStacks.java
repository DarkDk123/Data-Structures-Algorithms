/**
 * We have to implement a Queue using two Stacks!!
 * 
 * We can make either removal efficient (O(1)) or insertion efficient!
 * 
 * This code is Insertion (push) Efficient.
 */

import java.util.Stack; // Import Stack

class MyQueue {
    Stack<Integer> stack1, stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int poped = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return poped;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int poped = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return poped;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
