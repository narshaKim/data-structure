package C04.DataStructure;

import C04.Util.SortRuleType;

public abstract class AbstractLinkedList {

    public Node head;
    public Node cur;
    public Node before;
    public int numOfData;
    public SortRuleType sortRuleType;

    public abstract void init();
    public abstract boolean insert(int data);
    public abstract boolean first();
    public abstract boolean next();
    public abstract boolean remove();
    public abstract int get();
    public abstract int count();
    public abstract void setSortRule(SortRuleType sortRuleType);

}
