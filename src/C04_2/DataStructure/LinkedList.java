package C04_2.DataStructure;

import C04_2.Util.SortRuleType;

public class LinkedList extends AbstractLinkedList {

    @Override
    public void init() {
        head=new Node();
        head.next=null;

        numOfData=0;

        sortRuleType=null;
    }

    @Override
    public void insert(int data) {
        if(sortRuleType==null) {
            firstInsert(data);
        }
        else {
            sortInsert(data);
        }
    }

    private void firstInsert(int data) {
        Node newNode = new Node();
        newNode.data=data;

        newNode.next=head.next;
        head.next=newNode;

        numOfData++;
    }

    private void sortInsert(int data) {

    }

    @Override
    public int first() throws Exception {
        if(head.next==null)
            throw new Exception("there is No first Data");
        before=head;
        cur=head.next;
        int result = cur.data;
        return result;
    }

    @Override
    public int next() throws Exception {
        if(head.next==null)
            throw new Exception("there is No next Data");
        before = cur;
        cur = cur.next;
        int result = cur.data;
        return result;
    }

    @Override
    public int remove() throws Exception {
        if(head.next==null)
            throw new Exception("there is No removable Data");
        int result = cur.data;
        before.next=cur.next;
        cur=before;
        numOfData--;
        return result;
    }

    @Override
    public int count() {
        return numOfData;
    }

    @Override
    public void setSortRule(SortRuleType sortRuleType) {

    }
}
