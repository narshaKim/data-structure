package C05_2.DataStructure;

public class DoublyLinkedListImpl implements DoublyLinkedList {

    private int numOfData;
    private Node head;
    private Node cur;

    @Override
    public void init() {
        numOfData=0;
        head=null;
        cur=null;
    }

    @Override
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data=data;

        newNode.next=head;
        if(head!=null)
            head.prev=newNode;
        newNode.prev=null;
        head=newNode;

        numOfData++;
    }

    @Override
    public boolean first() {
        if(head==null)
            return false;
        cur=head;
        return true;
    }

    @Override
    public boolean next() {
        if(head==null || cur==null || cur.next==null)
            return false;
        cur=cur.next;
        return true;
    }

    @Override
    public boolean previous() {
        if(head==null || cur==null || cur.prev==null)
            return false;
        cur=cur.prev;
        return true;
    }

    @Override
    public int get() {
        return cur.data;
    }

    @Override
    public int count() {
        return numOfData;
    }
}
