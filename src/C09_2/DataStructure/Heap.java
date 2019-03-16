package C09_2.DataStructure;

public interface Heap {
    public void init();
    public boolean isEmpty();
    public void insert(char ch, int priority);
    public Data delete();
}
