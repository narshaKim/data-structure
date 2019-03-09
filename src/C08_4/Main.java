package C08_4;

import C08_4.DataStructure.BinaryTreeNode;
import C08_4.DataStructure.ExpressionTree;
import C08_4.DataStructure.ExpressionTreeImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        char[] exp = "12+7*".toCharArray();

        ExpressionTree expressionTree = new ExpressionTreeImpl();
        BinaryTreeNode bt = expressionTree.makeExpTree(exp);

        expressionTree.showPrefixTypeExp(bt);
        System.out.println();
        expressionTree.showInfixTypeExp(bt);
        System.out.println();
        expressionTree.showPostfixTypeExp(bt);
        System.out.println();

        System.out.println(expressionTree.evaluateExpTree(bt));

    }

}
