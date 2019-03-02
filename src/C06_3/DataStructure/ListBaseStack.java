package C06_3.DataStructure;

public interface ListBaseStack {

    public void init();
    public boolean isEmpty();
    public void push(int data);
    public int pop() throws Exception;
    public int peek() throws Exception;

}
