package C07_2.DataStructure;

public class CircularQueueImpl implements CircularQueue {

    final int QUE_LEN = 100;
    private int[] queArr;
    private int front;
    private int rear;

    @Override
    public void init() {
        queArr=new int[QUE_LEN];
        front=0;
        rear=0;
    }

    @Override
    public boolean isEmpty() {
        if(front==rear)
            return true;
        return false;
    }

    @Override
    public int nextPosIdx(int pos) {
        if(pos==QUE_LEN-1)
            return 0;
        return pos+1;
    }

    @Override
    public void enqueue(int data) throws Exception {
        if(nextPosIdx(rear)==front) {
            throw new Exception("Queue Memory Error!");
        }
        rear=nextPosIdx(rear);
        queArr[rear]=data;
    }

    @Override
    public int dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue Memory Error!");
        }
        front=nextPosIdx(front);
        return queArr[front];
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue Memory Error!");
        }
        return queArr[nextPosIdx(front)];
    }
}
