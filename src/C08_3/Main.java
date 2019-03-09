package C08_3;

import C08_3.DataStructure.BinaryTree2;
import C08_3.DataStructure.BinaryTree2Impl;
import C08_3.DataStructure.BinaryTreeNode;

public class Main {

    public static void main(String[] args) throws Exception {

        BinaryTree2 binaryTree = new BinaryTree2Impl();

        BinaryTreeNode bt1 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt2 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt3 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt4 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt5 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt6 = binaryTree.makeBinaryTreeNode();

        binaryTree.setData(bt1, 1);
        binaryTree.setData(bt2, 2);
        binaryTree.setData(bt3, 3);
        binaryTree.setData(bt4, 4);
        binaryTree.setData(bt5, 5);
        binaryTree.setData(bt6, 6);

        binaryTree.makeLeftSubTree(bt1, bt2);
        binaryTree.makeRightSubTree(bt1, bt3);
        binaryTree.makeLeftSubTree(bt2, bt4);
        binaryTree.makeRightSubTree(bt2, bt5);
        binaryTree.makeRightSubTree(bt3, bt6);

        binaryTree.preorderTraverse(bt1);
        System.out.println();
        binaryTree.inorderTraverse(bt1);
        System.out.println();
        binaryTree.postorderTraverse(bt1);
        System.out.println();

    }

}
