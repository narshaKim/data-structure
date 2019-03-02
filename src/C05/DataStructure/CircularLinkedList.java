package C05.DataStructure;

public class CircularLinkedList implements AbstractCircularLinkedList {

    private int numOfData;
    private Node tail;
    private Node cur;
    private Node before;

    @Override
    public void init() {
        tail=null;
        cur=null;
        before=null;
        numOfData=0;
    }

    @Override
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data=data;

        if(tail==null) {
            tail=newNode;
            tail.next=newNode;
        }
        else {
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }
        numOfData++;
    }

    @Override
    public void insertFront(int data) {
        Node newNode = new Node();
        newNode.data=data;
        if(tail==null) {
            tail=newNode;
            newNode.next=newNode;
        }
        else {
            newNode.next=tail.next;
            tail.next=newNode;
        }
        numOfData++;
    }

    @Override
    public boolean first() {
        if(tail==null)
            return false;
        before=tail;
        cur=tail.next;
        return true;
    }

    @Override
    public boolean next() {
        if(tail==null && cur==null)
            return false;
        before=cur;
        cur=cur.next;
        return true;
    }

    @Override
    public int get() {
        return cur.data;
    }

    @Override
    public int remove() {
        int data = cur.data;

        if(cur==tail) {
            if(tail.next==tail) {
                tail=null;
            }
            else {
                tail=before;
            }
        }

        before.next=cur.next;
        cur=before;

        numOfData--;
        return data;
    }

    @Override
    public int count() {
        return numOfData;
    }
}
