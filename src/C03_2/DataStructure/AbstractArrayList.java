package C03_2.DataStructure;

public abstract class AbstractArrayList {

    protected int listLength = 100;

    protected int[] array = new int[listLength];
    protected int numOfData;
    protected int curPosition;

    protected abstract void init();
    protected abstract void insert(int data) throws Exception;
    protected abstract int first() throws Exception;
    protected abstract int next() throws Exception;
    protected abstract int remove() throws Exception;
    protected abstract int count();

}
