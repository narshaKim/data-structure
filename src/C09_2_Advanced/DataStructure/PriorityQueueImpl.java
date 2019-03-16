package C09_2_Advanced.DataStructure;

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
    public void enqueue(char data) {
        heap.insert(data);
    }

    @Override
    public char dequeue() {
        return heap.delete();
    }
}
