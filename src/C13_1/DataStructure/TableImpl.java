package C13_1.DataStructure;

public class TableImpl implements Table {

    final int MAX_TBL = 100;
    Slot tbl[];
    HashFunctionType hashFunctionType;

    @Override
    public void init(HashFunctionType hashFunctionType) {
        this.hashFunctionType=hashFunctionType;
        tbl = new Slot[MAX_TBL];
        for(int i=0; i<tbl.length; i++) {
            tbl[i] = new Slot();
            tbl[i].slotStatus=SlotStatus.EMPTY;
        }
    }

    @Override
    public void insert(int key, Person person) {
        int hashValue = getHashValue(key);
        tbl[hashValue].key=key;
        tbl[hashValue].person=person;
        tbl[hashValue].slotStatus=SlotStatus.INUSE;
    }

    @Override
    public Person delete(int key) {
        int hashValue = getHashValue(key);
        if(tbl[hashValue].slotStatus==SlotStatus.INUSE) {
            tbl[hashValue].slotStatus=SlotStatus.DELETED;
            return tbl[hashValue].person;
        }
        return null;
    }

    @Override
    public Person search(int key) {
        int hashValue = getHashValue(key);
        if(tbl[hashValue].slotStatus==SlotStatus.INUSE)
            return tbl[hashValue].person;
        return null;
    }

    @Override
    public int getHashValue(int key) {
        switch (hashFunctionType) {
            case DEVIDE100:
                return key%100;
        }
        return key;
    }
}
