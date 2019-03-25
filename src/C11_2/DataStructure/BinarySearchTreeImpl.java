package C11_2.DataStructure;

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
    public BinaryTreeNode remove(BinaryTreeNode pRoot, int data) {
        BinaryTreeNode pVRoot = makeAndInit();
        BinaryTreeNode pNode = pVRoot;
        BinaryTreeNode dNode = pRoot;

        makeRightSubTree(pVRoot, pRoot);

        while (dNode!=null && getData(dNode)>0) {
            int cd = getData(dNode);
            if(data==cd)
                break;
            pNode=dNode;

            if(data<cd)
                dNode=getLeftSubTree(dNode);
            else
                dNode=getRightSubTree(dNode);
        }

        if(dNode==null)
            return pRoot;

        // 말단
        if(getLeftSubTree(dNode)==null && getRightSubTree(dNode)==null) {
            if(getLeftSubTree(pNode)==dNode)
                removeLeftSubTree(pNode);
            else
                removeRightSubTree(pNode);
        }
        // 둘 중 하나만 자식이 있음
        else if(getLeftSubTree(dNode)==null || getRightSubTree(dNode)==null) {
            BinaryTreeNode dcNode;
            if(getLeftSubTree(dNode)!=null)
                dcNode=getLeftSubTree(dNode);
            else
                dcNode=getRightSubTree(dNode);

            if(getLeftSubTree(pNode)==dNode)
                makeLeftSubTree(pNode, dcNode);
            else
                makeRightSubTree(pNode, dcNode);
        }
        // 둘 다 자식이 있음
        else {
            BinaryTreeNode mNode = getRightSubTree(dNode);
            BinaryTreeNode mpNode = dNode;

            while (getLeftSubTree(mNode)!=null) {
                mpNode=mNode;
                mNode=getLeftSubTree(mNode);
            }

            setData(dNode, getData(mNode));

            if(getLeftSubTree(mpNode)==mNode)
                makeLeftSubTree(mpNode, getRightSubTree(mNode));
            else
                makeRightSubTree(mpNode, getRightSubTree(mNode));
        }

        pRoot=getRightSubTree(pVRoot);

        return pRoot;
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
