package C13_2.ListDataStructure;

import C04.Util.SortRuleType;
import C13_2.DataStructure.Person;
import C13_2.DataStructure.Slot;

public class LinkedListImpl extends LinkedList {

    @Override
    public void init() {
        head=new Node();
        head.next=null;

        numOfData=0;

        sortRuleType=null;
    }

    @Override
    public boolean insert(Slot data) {
        if(sortRuleType==null) {
            return firstInsert(data);
        }
        else {
            return sortInsert(data);
        }
    }

    private boolean firstInsert(Slot data) {
        Node newNode = new Node();
        newNode.data=data;

        newNode.next=head.next;
        head.next=newNode;

        numOfData++;
        return true;
    }

    private boolean sortInsert(Slot data){
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
    public Slot get() {
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

    public boolean compare(Slot d1, Slot d2) {
        switch (sortRuleType) {
            case ASC:
                if(d1.key<=d2.key)
                    return true;
                return false;
            case DESC:
                if(d1.key>=d2.key)
                    return true;
                return false;
        }
        return false;
    }

}
