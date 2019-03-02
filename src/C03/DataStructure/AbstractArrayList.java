package C03.DataStructure;

public abstract class AbstractArrayList {

    public int listLength = 100;

    public int[] array = new int[listLength];
    public int numOfData;
    public int curPosition;

    public abstract void init();
    public abstract boolean insert(int data);
    public abstract boolean first();
    public abstract boolean next();
    public abstract int get();
    public abstract boolean remove();
    public abstract int count();

}
