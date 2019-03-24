package C08_3.DataStructure;

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

    @Override
    public void preorderTraverse(BinaryTreeNode bt) {
        if(bt==null)
            return;
        System.out.print(bt.data + " ");
        preorderTraverse(bt.left);
        preorderTraverse(bt.right);
    }

    @Override
    public void inorderTraverse(BinaryTreeNode bt) {
        if(bt==null)
            return;
        inorderTraverse(bt.left);
        System.out.print(bt.data + " ");
        inorderTraverse(bt.right);
    }

    @Override
    public void postorderTraverse(BinaryTreeNode bt) {
        if(bt==null)
            return;
        postorderTraverse(bt.left);
        postorderTraverse(bt.right);
        System.out.print(bt.data + " ");
    }
}
