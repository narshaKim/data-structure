package C06_2.DataStructure;

public class ArrayBaseStackImpl implements ArrayBaseStack {

    final private int STACK_LEN = 100;
    private int[] stackArr = new int[STACK_LEN];
    private int topIndex;

    @Override
    public void init() {
        topIndex=-1;
    }

    @Override
    public boolean isEmpty() {
        if(topIndex==-1)
            return true;
        return false;
    }

    @Override
    public void push(int data) {
        stackArr[++topIndex]=data;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackArr[topIndex--];
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackArr[topIndex];
    }
}
