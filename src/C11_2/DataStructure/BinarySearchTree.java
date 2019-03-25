package C11_2.DataStructure;

public interface BinarySearchTree {

    BinaryTreeNode makeAndInit();
    int getNodeData(BinaryTreeNode btn);
    void insert(BinaryTreeNode btn, int data);
    BinaryTreeNode remove(BinaryTreeNode btn, int data);
    BinaryTreeNode search(BinaryTreeNode btn, int target);

}
