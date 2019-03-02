package C06_3.DataStructure;

public class ListBaseStackImpl implements ListBaseStack {

    Node head;

    @Override
    public void init() {
        head=null;
    }

    @Override
    public boolean isEmpty() {
        if(head==null)
            return true;
        return false;
    }

    @Override
    public void push(int data) {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        int data = head.data;
        head=head.next;
        return data;
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return head.data;
    }
}
