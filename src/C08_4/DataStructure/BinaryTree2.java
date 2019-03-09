package C08_4.DataStructure;

public interface BinaryTree2 {

    BinaryTreeNode makeBinaryTreeNode();
    char getData(BinaryTreeNode bt);
    void setData(BinaryTreeNode bt, char data);
    BinaryTreeNode getLeftSubTree(BinaryTreeNode bt);
    BinaryTreeNode getRightSubTree(BinaryTreeNode bt);
    BinaryTreeNode makeLeftSubTree(BinaryTreeNode main, BinaryTreeNode sub);
    BinaryTreeNode makeRightSubTree(BinaryTreeNode main, BinaryTreeNode sub);
    void preorderTraverse(BinaryTreeNode bt);
    void inorderTraverse(BinaryTreeNode bt);
    void postorderTraverse(BinaryTreeNode bt);

}
