package C06_4.DataStructure;

public interface ListBaseStack {

    public void init();
    public boolean isEmpty();
    public void push(Object data);
    public Object pop() throws Exception;
    public Object peek() throws Exception;

}
