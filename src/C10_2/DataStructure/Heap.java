package C10_2.DataStructure;

public interface Heap {
    public void init();
    public void init(PriorityType priorityType);
    public boolean isEmpty();
    public void insert(int ch);
    public int delete();
    public boolean isPriority(int first, int second);
}
