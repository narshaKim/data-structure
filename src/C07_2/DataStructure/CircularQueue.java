package C07_2.DataStructure;

public interface CircularQueue {

    public void init();
    public boolean isEmpty();
    public int nextPosIdx(int pos);
    public void enqueue(int data) throws Exception;
    public int dequeue() throws Exception;
    public int peek() throws Exception;

}
