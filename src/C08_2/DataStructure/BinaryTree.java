package C08_2.DataStructure;

public interface BinaryTree {

    BinaryTreeNode makeBinaryTreeNode();
    int getData(BinaryTreeNode bt);
    void setData(BinaryTreeNode bt, int data);
    BinaryTreeNode getLeftSubTree(BinaryTreeNode bt);
    BinaryTreeNode getRightSubTree(BinaryTreeNode bt);
    BinaryTreeNode makeLeftSubTree(BinaryTreeNode main, BinaryTreeNode sub);
    BinaryTreeNode makeRightSubTree(BinaryTreeNode main, BinaryTreeNode sub);

}
