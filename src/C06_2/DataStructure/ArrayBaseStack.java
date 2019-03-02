package C06_2.DataStructure;

public interface ArrayBaseStack {

    public void init();
    public boolean isEmpty();
    public void push(int data);
    public int pop() throws Exception;
    public int peek() throws Exception;

}
