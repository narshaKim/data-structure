package C04_2.DataStructure;

import C04_2.Util.SortRuleType;

public abstract class AbstractLinkedList {

    protected Node head;
    protected Node cur;
    protected Node before;
    protected int numOfData;
    protected SortRuleType sortRuleType;

    protected abstract void init();
    protected abstract boolean insert(int data);
    protected abstract boolean first();
    protected abstract boolean next();
    protected abstract boolean remove();
    protected abstract int get();
    protected abstract int count();
    protected abstract void setSortRule(SortRuleType sortRuleType);

}
