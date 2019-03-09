package C08_4.DataStructure;

import C06_4.DataStructure.ListBaseStack;
import C06_4.DataStructure.ListBaseStackImpl;
import Util.Util;

public class ExpressionTreeImpl extends BinaryTree2Impl implements ExpressionTree {

    @Override
    public BinaryTreeNode makeExpTree(char[] exp) throws Exception {
        ListBaseStack stack = new ListBaseStackImpl();
        for(char ch : exp) {
            BinaryTreeNode bt = makeBinaryTreeNode();
            setData(bt, ch);
            if(!Util.isDigit(ch)) {
                BinaryTreeNode right = (BinaryTreeNode) stack.pop();
                BinaryTreeNode left = (BinaryTreeNode) stack.pop();
                makeLeftSubTree(bt, left);
                makeRightSubTree(bt, right);
            }
            stack.push(bt);
        }
        return (BinaryTreeNode) stack.pop();
    }

    @Override
    public int evaluateExpTree(BinaryTreeNode bt) {
        if(getLeftSubTree(bt)==null)
            return getData(bt)-'0';

        int leftResult = evaluateExpTree(getLeftSubTree(bt));
        int rightResult = evaluateExpTree(getRightSubTree(bt));
        switch (getData(bt)) {
            case '+':
                return leftResult+rightResult;
            case '-':
                return leftResult-rightResult;
            case '*':
                return leftResult*rightResult;
            case '/':
                return leftResult/rightResult;
        }
        return -1;
    }

    @Override
    public void showPrefixTypeExp(BinaryTreeNode bt) {
        preorderTraverse(bt);
    }

    @Override
    public void showInfixTypeExp(BinaryTreeNode bt) {
        inorderTraverse(bt);
    }

    @Override
    public void showPostfixTypeExp(BinaryTreeNode bt) {
        postorderTraverse(bt);
    }
}
