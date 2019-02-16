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
    public boolean insert(int data) {
        if(sortRuleType==null) {
            return firstInsert(data);
        }
        else {
            return sortInsert(data);
        }
    }

    private boolean firstInsert(int data) {
        Node newNode = new Node();
        newNode.data=data;

        newNode.next=head.next;
        head.next=newNode;

        numOfData++;
        return true;
    }

    private boolean sortInsert(int data){
        Node newNode = new Node();
        newNode.data = data;
        Node pred = head;

        while (pred.next!=null && !compare(data, pred.next.data)) {
            pred = pred.next;
        }
        newNode.next=pred.next;
        pred.next=newNode;
        numOfData++;
        return true;
    }

    @Override
    public boolean first(){
        if(head.next==null)
            return false;
        before=head;
        cur=head.next;
        return true;
    }

    @Override
    public boolean next(){
        if(cur.next==null)
            return false;
        before = cur;
        cur = cur.next;
        return true;
    }

    @Override
    public boolean remove(){
        before.next=cur.next;
        cur=before;
        numOfData--;
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

    @Override
    public void setSortRule(SortRuleType sortRuleType) {
        this.sortRuleType=sortRuleType;
    }

    public boolean compare(int d1, int d2) {
        switch (sortRuleType) {
            case ASC:
                if(d1<=d2)
                    return true;
                return false;
            case DESC:
                if(d1>=d2)
                    return true;
                return false;
        }
        return false;
    }

}
