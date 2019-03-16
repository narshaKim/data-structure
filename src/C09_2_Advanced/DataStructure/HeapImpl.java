package C09_2_Advanced.DataStructure;

public class HeapImpl implements Heap {

    private final int HEAP_LEN = 100;
    private int numOfData;
    private char[] heapArr;
    private PriorityType priorityType=PriorityType.ASC;

    @Override
    public void init() {
        heapArr = new char[HEAP_LEN];
        numOfData = 0;
    }

    @Override
    public void init(PriorityType priorityType) {
        this.init();
        this.priorityType=priorityType;
    }

    @Override
    public boolean isEmpty() {
        if(numOfData==0)
            return true;
        return false;
    }

    @Override
    public void insert(char ch) {
        numOfData++;
        int idx = numOfData;

        while (idx>1) {
            if(!isPriority(heapArr[getParentIdx(idx)], ch)) {
                heapArr[idx]=heapArr[getParentIdx(idx)];
                idx=getParentIdx(idx);
            }
            else
                break;
        }

        heapArr[idx]=ch;
    }

    @Override
    public char delete() {
        char data = heapArr[1];
        char lastData =heapArr[numOfData];

        int parentIdx = 1;

        while (true) {
            int childIdx = getHigherPriorityChildIdx(parentIdx);
            if(childIdx==0)
                break;
            if(isPriority(lastData, heapArr[childIdx]))
                break;
            heapArr[parentIdx]=heapArr[childIdx];
            parentIdx=childIdx;
        }

        heapArr[parentIdx]=lastData;
        numOfData--;

        return data;
    }

    private int getHigherPriorityChildIdx(int idx) {
        int leftIdx = getLeftChildIdx(idx);
        int rightIdx = getRightChildIdx(idx);

        if(leftIdx>numOfData)
            return 0;
        else if(leftIdx==numOfData)
            return leftIdx;

        if(isPriority(heapArr[leftIdx], heapArr[rightIdx]))
            return leftIdx;
        return rightIdx;
    }

    public int getParentIdx(int idx) {
        return idx/2;
    }

    public int getLeftChildIdx(int idx) {
        return idx*2;
    }

    public int getRightChildIdx(int idx) {
        return idx*2+1;
    }

    @Override
    public boolean isPriority(char first, char second) {
        switch (this.priorityType) {
            case ASC:
                if(first>second)
                    return false;
                break;
            case DESC:
                if(first<second)
                    return false;
                break;
        }
        return true;
    }
}
