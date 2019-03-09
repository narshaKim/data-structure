package C07_5.DataStructure;

public interface Deque {

    public void init();
    public boolean isEmpty();
    public void addFirst(int data);
    public void addLast(int data);
    public int removeFirst() throws Exception;
    public int removeLast() throws Exception;
    public int getFirst() throws Exception;
    public int getLast() throws Exception;

}
