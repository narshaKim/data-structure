package C11_1.DataStructure;

public class BinarySearchTreeImpl extends BinaryTreeImpl implements BinarySearchTree {

    @Override
    public BinaryTreeNode makeAndInit() {
        return new BinaryTreeNode();
    }

    @Override
    public int getNodeData(BinaryTreeNode btn) {
        return getData(btn);
    }

    @Override
    public void insert(BinaryTreeNode btn, int data) {
        BinaryTreeNode pNode = null;
        BinaryTreeNode cNode = btn;

        while (cNode!=null && getData(cNode)>0) {
            pNode=cNode;
            if(data==getData(cNode))
                return;
            else if(data<getData(cNode))
                cNode=getLeftSubTree(cNode);
            else
                cNode=getRightSubTree(cNode);
        }

        if(pNode==null) {
            setData(btn, data);
            return;
        }

        BinaryTreeNode nNode = new BinaryTreeNode();
        setData(nNode, data);

        if(data<getData(pNode))
            makeLeftSubTree(pNode, nNode);
        else
            makeRightSubTree(pNode, nNode);

    }

    @Override
    public BinaryTreeNode search(BinaryTreeNode bst, int target) {
        BinaryTreeNode cNode = bst;
        while (cNode!=null && getData(cNode)>0) {
            int cd = getData(cNode);
            if(target==cd)
                return cNode;
            else if(target<cd)
                cNode=getLeftSubTree(cNode);
            else
                cNode=getRightSubTree(cNode);
        }
        return null;
    }
}
