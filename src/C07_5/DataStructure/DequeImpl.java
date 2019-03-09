package C07_5.DataStructure;

public class DequeImpl implements Deque {

    private Node head;
    private Node tail;

    @Override
    public void init() {
        head=null;
        tail=null;
    }

    @Override
    public boolean isEmpty() {
        if(head==null)
            return true;
        return false;
    }

    @Override
    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;

        if(isEmpty())
            tail=newNode;
        else
            head.prev=newNode;
        head=newNode;
    }

    @Override
    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data=data;
        newNode.prev=tail;

        if(isEmpty())
            head=newNode;
        else
            tail.next=newNode;

        tail=newNode;
    }

    @Override
    public int removeFirst() throws Exception {
        if(isEmpty())
            throw new Exception("Deque Memory Error!");
        int data = head.data;
        head=head.next;
        if(head==null)
            tail=null;
        else
            head.prev=null;
        return data;
    }

    @Override
    public int removeLast() throws Exception {
        if(isEmpty())
            throw new Exception("Deque Memory Error!");
        int data = tail.data;
        tail=tail.prev;

        if(tail==null)
            head=null;
        else
            tail.next=null;
        return data;
    }

    @Override
    public int getFirst() throws Exception {
        if(isEmpty())
            throw new Exception("Deque Memory Error!");
        return head.data;
    }

    @Override
    public int getLast() throws Exception {
        if(isEmpty())
            throw new Exception("Deque Memory Error!");
        return tail.data;
    }
}
