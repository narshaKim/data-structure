package C08_2.DataStructure;

public class BinaryTreeImpl implements BinaryTree {

    @Override
    public BinaryTreeNode makeBinaryTreeNode() {
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
        return binaryTreeNode;
    }

    @Override
    public int getData(BinaryTreeNode bt) {
        return bt.data;
    }

    @Override
    public void setData(BinaryTreeNode bt, int data) {
        bt.data=data;
    }

    @Override
    public BinaryTreeNode getLeftSubTree(BinaryTreeNode bt) {
        return bt.left;
    }

    @Override
    public BinaryTreeNode getRightSubTree(BinaryTreeNode bt) {
        return bt.right;
    }

    @Override
    public BinaryTreeNode makeLeftSubTree(BinaryTreeNode main, BinaryTreeNode sub) {
        main.left= sub;
        return main;
    }

    @Override
    public BinaryTreeNode makeRightSubTree(BinaryTreeNode main, BinaryTreeNode sub) {
        main.right= sub;
        return main;
    }
}
