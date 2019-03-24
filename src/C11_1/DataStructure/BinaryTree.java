package C11_1.DataStructure;

public interface BinaryTree {

    BinaryTreeNode makeBinaryTreeNode();
    int getData(BinaryTreeNode bt);
    void setData(BinaryTreeNode bt, int data);
    BinaryTreeNode getLeftSubTree(BinaryTreeNode bt);
    BinaryTreeNode getRightSubTree(BinaryTreeNode bt);
    BinaryTreeNode makeLeftSubTree(BinaryTreeNode main, BinaryTreeNode sub);
    BinaryTreeNode makeRightSubTree(BinaryTreeNode main, BinaryTreeNode sub);
    void removeLeftSubTree(BinaryTreeNode node);
    void removeRightSubTree(BinaryTreeNode node);
    void preorderTraverse(BinaryTreeNode bt);
    void inorderTraverse(BinaryTreeNode bt);
    void postorderTraverse(BinaryTreeNode bt);

}
