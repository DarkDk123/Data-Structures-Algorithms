package custom;
/**
 * It is much like normal/static stack.
 * We'll extend it with static Stack and will override push method.
 * With additional method "growSize"
 */


class CustomDynamicStack extends CustomStack{
    
    // creating constructors from super keyword.
    CustomDynamicStack(){
        super();
    }

    // With size.
    CustomDynamicStack(int size){
        super(size);
    }

    // 
    // After extending custom static stack,
    // let's override push method to be able to grow size
    @Override
    public void push(int ele) {
        if (stackArray.length-1 == top){
            growSize();
        }

        stackArray[++top] = ele;
    }

    private void growSize(){
        // Double the size.
        int[] newArray = new int[stackArray.length*2];

        for(int i = 0; i < stackArray.length; i++){
            newArray[i] = stackArray[i];
        }

        // Make new array as "stackArray".
        stackArray = newArray;
    }


    // Main Runner method.
    public static void main(String[] args) {
        CustomStack myStack = new CustomDynamicStack(0);

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
        System.out.println("Push 10.");
        myStack.push(10);
        // seek top element.
        System.out.println("Let's see element at the top  : " + myStack.seek());

        // After removing 2 elements, seek top
        System.out.println(myStack.pop() + " removed !");
        System.out.println(myStack.pop() + " removed !");

        System.out.println("Now, %d is at the top!".formatted(myStack.seek()));
    }    
}
