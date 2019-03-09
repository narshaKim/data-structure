package C08_4.DataStructure;

public interface ExpressionTree {

    BinaryTreeNode makeExpTree(char[] exp) throws Exception;
    int evaluateExpTree(BinaryTreeNode bt);
    void showPrefixTypeExp(BinaryTreeNode bt);
    void showInfixTypeExp(BinaryTreeNode bt);
    void showPostfixTypeExp(BinaryTreeNode bt);

}
