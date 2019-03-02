package C05_1.DataStructure;

public interface CircularLinkedList {

    public void init();
    public void insert(int data);
    public void insertFront(int data);
    public boolean first();
    public boolean next();
    public int get();
    public int remove();
    public int count();

}
