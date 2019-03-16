package C09_2.DataStructure;

public class HeapImpl implements Heap {

    private final int HEAP_LEN = 100;
    private int numOfData;
    private Data[] heapArr;

    @Override
    public void init() {
        heapArr = new Data[HEAP_LEN];
        numOfData = 0;
    }

    @Override
    public boolean isEmpty() {
        if(numOfData==0)
            return true;
        return false;
    }

    @Override
    public void insert(char ch, int priority) {
        numOfData++;
        int idx = numOfData;

        Data data = new Data();
        data.data=ch;
        data.priorty=priority;

        while (idx>1) {
            if(heapArr[getParentIdx(idx)].priorty>data.priorty) {
                heapArr[idx]=heapArr[getParentIdx(idx)];
                idx=getParentIdx(idx);
            }
            else
                break;
        }

        heapArr[idx]=data;
    }

    @Override
    public Data delete() {
        Data data = heapArr[1];
        Data lastData =heapArr[numOfData];

        int parentIdx = 1;

        while (true) {
            int childIdx = getHigherPriorityChildIdx(parentIdx);
            if(childIdx==0)
                break;
            if(lastData.priorty<=heapArr[childIdx].priorty)
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

        if(heapArr[leftIdx].priorty<heapArr[rightIdx].priorty)
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
}
