package C13_2.ListDataStructure;

import C04.Util.SortRuleType;
import C13_2.DataStructure.Slot;

public abstract class LinkedList {

    public Node head;
    public Node cur;
    public Node before;
    public int numOfData;
    public SortRuleType sortRuleType;

    public abstract void init();
    public abstract boolean insert(Slot data);
    public abstract boolean first();
    public abstract boolean next();
    public abstract boolean remove();
    public abstract Slot get();
    public abstract int count();
    public abstract void setSortRule(SortRuleType sortRuleType);

}
