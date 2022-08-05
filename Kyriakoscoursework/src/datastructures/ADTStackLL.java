package datastructures;

public class ADTStackLL <E> implements IADTStack<E>{
    private listNode<E> stackTop;  // This will be null if empty or point to the top of the list
    private int stackSize;      // This will maintain the size of the stack
    /**
     * Default constructor
     */
    public ADTStackLL() {
        this.stackTop = null;
        this.stackSize = 0;
    }
    @Override
    public void createStack() {
        this.stackTop = null;
        this.stackSize = 0;
    }

    @Override
    public void push(E theNode) {
        // Add your code here
    }

    @Override
    public listNode<E> pop() {
        // Add your code here
        return null;  // Add your return value here
    }

    @Override
    public listNode<E> peek() {
        // Add your code here
        return null;  // Add your return value here
    }

    @Override
    public boolean isEmpty() {
        // Add your code here
        return true;  // Add your return value here
    }

    @Override
    public boolean isFull() {
        // Technically for a linked list implementation there is
        // no limit. However, it may be possible for the heap to be
        // full which will cause a "stack overflow"
        return false;
    }

    public void displayStack() {
        // Add your code here
    }

    public String outputStack() {
        // Add your code here
        return null;  // Add your return value here
    }

    public int getStackSize() {
        // Add your code here
        return 0;  // Add your return value here
    }
}
