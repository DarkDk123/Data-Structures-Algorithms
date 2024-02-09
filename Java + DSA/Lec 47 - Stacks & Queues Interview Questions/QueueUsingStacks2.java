
/**
 * We have to implement a Queue using two Stacks!!
 * 
 * We can make either removal efficient (O(1)) or insertion efficient!
 * 
 * This code is Removal Efficient.
 */

import java.util.Stack; // Import Stack

class MyQueue {
    Stack<Integer> stack1, stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Efficient removal / pop of element.
    public int pop() {
        return stack1.pop();
    }
    
    // Peek also becomes of O(1) Complexity!!
    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
