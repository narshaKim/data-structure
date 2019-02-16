package C04_2.DataStructure;

import C04_2.Util.SortRuleType;

public abstract class AbstractLinkedList {

    protected Node head;
    protected Node cur;
    protected Node before;
    protected int numOfData;
    protected SortRuleType sortRuleType;

    protected abstract void init();
    protected abstract void insert(int data);
    protected abstract int first() throws Exception;
    protected abstract int next() throws Exception;
    protected abstract int remove() throws Exception;
    protected abstract int count();
    protected abstract void setSortRule(SortRuleType sortRuleType);

}
