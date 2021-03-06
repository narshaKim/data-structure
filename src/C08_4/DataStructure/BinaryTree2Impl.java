package C08_4.DataStructure;

public class BinaryTree2Impl implements BinaryTree2 {

    @Override
    public BinaryTreeNode makeBinaryTreeNode() {
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
        return binaryTreeNode;
    }

    @Override
    public char getData(BinaryTreeNode bt) {
        return bt.data;
    }

    @Override
    public void setData(BinaryTreeNode bt, char data) {
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
        if(bt.left!=null)
            System.out.print("(");
        inorderTraverse(bt.left);
        System.out.print(bt.data + " ");
        inorderTraverse(bt.right);
        if(bt.left!=null)
            System.out.print(")");
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
