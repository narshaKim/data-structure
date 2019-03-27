package C14_4.SubDataStructure;

import C14_4.DataStructure.AdjaventListEdge;

public interface PriorityQueue {

    public void init();
    public void init(PriorityType priorityType);
    public boolean isEmpty();
    public void enqueue(AdjaventListEdge data);
    public AdjaventListEdge dequeue();

}
