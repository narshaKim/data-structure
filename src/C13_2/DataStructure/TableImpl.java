package C13_2.DataStructure;

import C13_1.DataStructure.HashFunctionType;
import C13_2.ListDataStructure.LinkedList;
import C13_2.ListDataStructure.LinkedListImpl;

public class TableImpl implements Table {

    final int MAX_TBL = 100;
    HashFunctionType hashFunctionType;
    LinkedList[] tbl;

    @Override
    public void init(HashFunctionType hashFunctionType) {
        this.hashFunctionType=hashFunctionType;
        tbl = new LinkedList[MAX_TBL];

        for(int i=0; i<tbl.length; i++) {
            tbl[i]=new LinkedListImpl();
            tbl[i].init();
        }
    }

    @Override
    public void insert(int key, Person person) {
        int hashValue = getHashValue(key);
        if(search(key)!=null) {
            System.out.println("중복");
            return;
        }
        Slot slot = new Slot();
        slot.key=key;
        slot.person=person;
        tbl[hashValue].insert(slot);
    }

    @Override
    public Person delete(int key) {
        int hashValue = getHashValue(key);
        LinkedList list = tbl[hashValue];
        if(list.first()) {
            Slot slot = list.get();
            if(slot.key==key) {
                Person person = slot.person;
                list.remove();
                return person;
            }
            while (list.next()) {
                slot=list.get();
                if(slot.key==key) {
                    Person person = slot.person;
                    list.remove();
                    return person;
                }
            }
        }
        return null;
    }

    @Override
    public Person search(int key) {
        int hashValue = getHashValue(key);
        LinkedList list = tbl[hashValue];
        if(list.first()) {
            Slot slot = list.get();
            if(slot.key==key)
                return slot.person;
            while (list.next()) {
                slot = list.get();
                if(slot.key==key)
                    return slot.person;
            }
        }
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
