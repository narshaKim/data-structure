package C07_2.DataStructure;

public interface CircularQueue {

    public void init();
    public boolean isEmpty();
    public int nextPosIdx(int pos);
    public void enqueue(int data);
    public int dequeue();
    public int peek();

}
