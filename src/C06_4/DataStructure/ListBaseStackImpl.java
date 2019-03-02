package C06_4.DataStructure;

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
    public void push(Object data) {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }

    @Override
    public Object pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        Object data = head.data;
        head=head.next;
        return data;
    }

    @Override
    public Object peek() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return head.data;
    }
}
