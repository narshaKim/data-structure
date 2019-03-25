package C12_2.DataStructure;

import C11_2.DataStructure.BinaryTreeNode;

public interface BinarySearchTree {

    BinaryTreeNode makeAndInit();
    int getNodeData(BinaryTreeNode btn);
    BinaryTreeNode insert(BinaryTreeNode btn, int data);
    BinaryTreeNode remove(BinaryTreeNode btn, int data);
    BinaryTreeNode search(BinaryTreeNode btn, int target);
    int getHeight(BinaryTreeNode pRoot);
    int getHeightDiff(BinaryTreeNode pRoot);
    BinaryTreeNode rotateLL(BinaryTreeNode bst);
    BinaryTreeNode rotateRR(BinaryTreeNode bst);
    BinaryTreeNode rotateLR(BinaryTreeNode bst);
    BinaryTreeNode rotateRL(BinaryTreeNode bst);
    BinaryTreeNode rebalance(BinaryTreeNode pRoot);

}
