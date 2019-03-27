package C14_4.SubDataStructure;

import C14_4.DataStructure.AdjaventListEdge;

public interface Heap {
    public void init();
    public void init(PriorityType priorityType);
    public boolean isEmpty();
    public void insert(AdjaventListEdge ch);
    public AdjaventListEdge delete();
    public boolean isPriority(AdjaventListEdge first, AdjaventListEdge second);
}
