package C11_1.DataStructure;

public interface BinarySearchTree {

    BinaryTreeNode makeAndInit();
    int getNodeData(BinaryTreeNode btn);
    void insert(BinaryTreeNode btn, int data);
    BinaryTreeNode search(BinaryTreeNode btn, int target);

}
