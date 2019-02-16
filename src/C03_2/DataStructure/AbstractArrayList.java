package C03_2.DataStructure;

public abstract class AbstractArrayList {

    protected int listLength = 100;

    protected int[] array = new int[listLength];
    protected int numOfData;
    protected int curPosition;

    protected abstract void init();
    protected abstract boolean insert(int data);
    protected abstract boolean first();
    protected abstract boolean next();
    protected abstract int get();
    protected abstract boolean remove();
    protected abstract int count();

}
