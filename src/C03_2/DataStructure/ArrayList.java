package C03_2.DataStructure;

public class ArrayList extends AbstractArrayList {

    @Override
    protected void init() {
        numOfData=0;
        curPosition=-1;
    }

    @Override
    protected void insert(int data) throws Exception {
        if(numOfData>=listLength) {
            throw new Exception("데이터를 더 추가할 수 없습니다.");
        }
        array[numOfData]=data;
        numOfData++;
    }

    @Override
    protected int first() throws Exception {
        if(numOfData==0)
            throw new Exception("데이터가 없습니다.");
        curPosition=0;
        int result = array[curPosition];
        return result;
    }

    @Override
    protected int next() throws Exception {
        if(numOfData<=curPosition+1)
            throw new Exception("현재 마지막 데이터입니다.");
        curPosition++;
        int result = array[curPosition];
        return result;
    }

    @Override
    protected int remove() throws Exception {
        if(numOfData==0)
            throw new Exception("삭제할 데이터가 없습니다.");

        int result = array[curPosition];

        for(int idx=curPosition; idx<numOfData-1; idx++)
            array[idx]=array[idx+1];

        numOfData--;
        curPosition--;

        return result;
    }

    @Override
    protected int count() {
        return numOfData;
    }
}
