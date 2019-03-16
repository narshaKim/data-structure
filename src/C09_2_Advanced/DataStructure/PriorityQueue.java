package C09_2_Advanced.DataStructure;

public interface PriorityQueue {

    public void init();
    public void init(PriorityType priorityType);
    public boolean isEmpty();
    public void enqueue(char data);
    public char dequeue();

}
