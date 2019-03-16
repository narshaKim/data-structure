package C09_2_Advanced.DataStructure;

public interface Heap {
    public void init();
    public void init(PriorityType priorityType);
    public boolean isEmpty();
    public void insert(char ch);
    public char delete();
    public boolean isPriority(char first, char second);
}
