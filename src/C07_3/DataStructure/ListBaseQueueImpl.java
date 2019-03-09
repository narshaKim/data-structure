package C07_3.DataStructure;

public class ListBaseQueueImpl implements ListBaseQueue {

    private Node front;
    private Node rear;

    @Override
    public void init() {
        front=null;
        rear=null;
    }

    @Override
    public boolean isEmpty() {
        if(front==null)
            return true;
        return false;
    }

    @Override
    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()) {
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next=newNode;
            rear=newNode;
        }
    }

    @Override
    public int dequeue() throws Exception {
        if(isEmpty())
            throw new Exception("Queue Memory Error!");
        int data = front.data;
        front=front.next;
        return data;
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Queue Memory Error!");
        return front.data;
    }
}
