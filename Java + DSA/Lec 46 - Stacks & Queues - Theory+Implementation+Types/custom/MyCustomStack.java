package custom;
/**
 * Using implemented structures.
 */

public class MyCustomStack{
    public static void main(String[] args){
        CustomStack myStack = new CustomStack();

        System.out.println("Print empty stack : " + myStack);

        // pushing 5 elements
        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }

        System.out.println("After pushing 5 elements : " + myStack);

        // pop out this in LIFO order.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Removal " + i + " : " + myStack.pop());
        }

        // Let's remove when stack is empty.
        // below line will throw "StackUnderFlowException"

        // System.out.println("Remove from Empty stack : " + myStack.pop());

        // Push elements to full our stack.
        System.out.println("Let's full our stack!");
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        System.out.println(myStack);

        // If we add more, it will throw stack Overflow Error!
        // myStack.push(10);

        // seek top element.
        System.out.println("Let's see element at the top  : " + myStack.seek());

        // After removing 2 elements, seek top
        System.out.println(myStack.pop() + " removed !");
        System.out.println(myStack.pop() + " removed !");

        System.out.println("Now, %d is at the top!".formatted(myStack.seek()));
    }
}

/**
 * Custom definition of a Stack, i won't use generics here, just a Integer implementation is OK!
 */

class CustomStack {
    
    // It will internally use an array.
    protected int[] stackArray;
    protected int top;
    private final int DEFAULT_SIZE = 10; // Default size | Static to make common among objects.

    // Constructor with size parameter.
    public CustomStack(int size) {
        if (size <= 0) size = DEFAULT_SIZE;
        stackArray = new int[size];
        top = -1;
    }

    // empty constructor.
    public CustomStack(){
        stackArray = new int[DEFAULT_SIZE];
        top = -1;
    }


    // Pushing into a stack
    public void push(int ele){
        if (stackArray.length-1 == top){
            throw new StackOverflowError("Can't push more elements!"); // Throwing Error doesn't need the "throws" syntax at the method.
            // While this can't work if we throw an exception, that must be explicitly shown.
        }

        stackArray[++top] = ele;
    }

    // Pop element from a stack
    public int pop(){
        // Here, if "Error" were "Exception", it will need pop to have "throws Exception" syntax.
        // We can also grow the size of the stack if wanted! (Dynamic stack)
        if (top==-1) throw new Error("StackUnderflowException!");

        return stackArray[top--];
    }

    // Seek element from a stack | element at Top.

    public int seek(){
        if (top==-1) throw new Error("StackUnderflowException!");
        return stackArray[top];
    }

    // To string method to print stack.

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: [");

        for(int i=0; i<=top; i++){
            if (i==top) return sb.append(i + "]").toString();
            sb.append(i + ", ");
        }

        return "[Empty Stack]";
    }
}
