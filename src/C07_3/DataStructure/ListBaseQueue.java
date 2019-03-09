package C07_3.DataStructure;

public interface ListBaseQueue {

    public void init();
    public boolean isEmpty();
    public void enqueue(int data);
    public int dequeue() throws Exception;
    public int peek() throws Exception;

}
