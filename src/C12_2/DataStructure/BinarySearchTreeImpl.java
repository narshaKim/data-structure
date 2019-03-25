package C12_2.DataStructure;

import C11_2.DataStructure.BinaryTreeImpl;
import C11_2.DataStructure.BinaryTreeNode;

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
    public BinaryTreeNode insert(BinaryTreeNode btn, int data) {
        BinaryTreeNode pNode = null;
        BinaryTreeNode cNode = btn;

        while (cNode!=null && getData(cNode)>0) {
            pNode=cNode;
            if(data==getData(cNode))
                return btn;
            else if(data<getData(cNode))
                cNode=getLeftSubTree(cNode);
            else
                cNode=getRightSubTree(cNode);
        }

        if(pNode==null) {
            setData(btn, data);
            return btn;
        }

        BinaryTreeNode nNode = new BinaryTreeNode();
        setData(nNode, data);

        if(data<getData(pNode))
            makeLeftSubTree(pNode, nNode);
        else
            makeRightSubTree(pNode, nNode);

        return rebalance(btn);
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
        pRoot=rebalance(pRoot);

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

    @Override
    public int getHeight(BinaryTreeNode pRoot) {
        if(pRoot==null)
            return 0;
        int leftH = getHeight(getLeftSubTree(pRoot));
        int rightH = getHeight(getRightSubTree(pRoot));

        return Math.max(leftH, rightH)+1;
    }

    @Override
    public int getHeightDiff(BinaryTreeNode pRoot) {
        if(pRoot==null)
            return 0;
        int left = getHeight(getLeftSubTree(pRoot));
        int right = getHeight(getRightSubTree(pRoot));
        return left-right;
    }

    @Override
    public BinaryTreeNode rotateLL(BinaryTreeNode pNode) {
        BinaryTreeNode cNode = getLeftSubTree(pNode);
        makeLeftSubTree(pNode, getRightSubTree(cNode));
        makeRightSubTree(cNode, pNode);
        return cNode;
    }

    @Override
    public BinaryTreeNode rotateRR(BinaryTreeNode pNode) {
        BinaryTreeNode cNode = getRightSubTree(pNode);
        makeRightSubTree(pNode, getLeftSubTree(cNode));
        makeLeftSubTree(cNode, pNode);
        return cNode;
    }

    @Override
    public BinaryTreeNode rotateLR(BinaryTreeNode pNode) {
        BinaryTreeNode cNode = getLeftSubTree(pNode);
        makeLeftSubTree(pNode, rotateRR(cNode));
        return rotateLL(pNode);
    }

    @Override
    public BinaryTreeNode rotateRL(BinaryTreeNode pNode) {
        BinaryTreeNode cNode = getRightSubTree(pNode);
        makeRightSubTree(pNode, rotateLL(cNode));
        return rotateRR(pNode);
    }

    @Override
    public BinaryTreeNode rebalance(BinaryTreeNode pRoot) {
        int hDiff = getHeightDiff(pRoot);
        if(hDiff>1) {
            if(getLeftSubTree(getLeftSubTree(pRoot))!=null)
                return rotateLL(pRoot);
            else
                return rotateLR(pRoot);
        }
        else if(hDiff<-1) {
            if(getRightSubTree(getRightSubTree(pRoot))!=null)
                return rotateRR(pRoot);
            else
                return rotateRL(pRoot);
        }
        return pRoot;
    }
}
