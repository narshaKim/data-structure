package C03.DataStructure;

public class ArrayList extends AbstractArrayList {

    @Override
    public void init() {
        numOfData=0;
        curPosition=-1;
    }

    @Override
    public boolean insert(int data){
        if(numOfData>=listLength) {
            return false;
        }
        array[numOfData]=data;
        numOfData++;
        return true;
    }

    @Override
    public boolean first(){
        if(numOfData==0)
            return false;
        curPosition=0;
        return true;
    }

    @Override
    public boolean next(){
        if(numOfData<=curPosition+1)
            return false;
        curPosition++;
        return true;
    }

    @Override
    public int get() {
        return array[curPosition];
    }

    @Override
    public boolean remove(){
        if(numOfData==0)
            return false;

        for(int idx=curPosition; idx<numOfData-1; idx++)
            array[idx]=array[idx+1];

        numOfData--;
        curPosition--;

        return true;
    }

    @Override
    public int count() {
        return numOfData;
    }
}
