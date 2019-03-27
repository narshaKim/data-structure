package C14_4.SubDataStructure;

import C14_4.DataStructure.AdjaventListEdge;

public class PriorityQueueImpl implements PriorityQueue {

    Heap heap;

    @Override
    public void init() {
        heap = new HeapImpl();
        heap.init();
    }

    @Override
    public void init(PriorityType priorityType) {
        heap = new HeapImpl();
        heap.init(priorityType);
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public void enqueue(AdjaventListEdge data) {
        heap.insert(data);
    }

    @Override
    public AdjaventListEdge dequeue() {
        return heap.delete();
    }
}
