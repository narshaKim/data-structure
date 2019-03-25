package C13_2.DataStructure;

import C13_1.DataStructure.HashFunctionType;

public interface Table {
    void init(HashFunctionType hashFunctionType);
    void insert(int key, Person person);
    Person delete(int key);
    Person search(int key);
    int getHashValue(int key);
}
