/**
 * We have to implement a Queue using two Stacks!!
 * 
 * This is a amortized analysed code!
 * 
 * This code Efficiently performs Push/Pop at average!
 * when similar operations are performed in a sequence!
 * Push - O(1)
 * Pop - O(n) - amortized
 * peek - O(n) - amortized
 */

import java.util.Stack;

public class MyQueue {

    Stack<Integer> mainStack, helperStack;

    public MyQueue() {
        mainStack = new Stack<Integer>();
        helperStack = new Stack<Integer>();
    }

    public void push(int x) {
        while (!helperStack.isEmpty()) {
            mainStack.push(helperStack.pop());
        }

        mainStack.push(x);
    }

    public int pop() {
        while (!mainStack.isEmpty()) {
            helperStack.push(mainStack.pop());
        }

        return helperStack.pop();
    }

    public int peek() {
        while (!mainStack.isEmpty()) {
            helperStack.push(mainStack.pop());
        }

        return helperStack.peek();
    }

    public boolean empty() {
        return !(helperStack.isEmpty() || mainStack.isEmpty());
    }
}
