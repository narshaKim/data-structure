package C08_2;

import C08_2.DataStructure.BinaryTree;
import C08_2.DataStructure.BinaryTreeImpl;
import C08_2.DataStructure.BinaryTreeNode;

public class Main {

    public static void main(String[] args) throws Exception {

        BinaryTree binaryTree = new BinaryTreeImpl();

        BinaryTreeNode bt1 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt2 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt3 = binaryTree.makeBinaryTreeNode();
        BinaryTreeNode bt4 = binaryTree.makeBinaryTreeNode();

        binaryTree.setData(bt1, 1);
        binaryTree.setData(bt2, 2);
        binaryTree.setData(bt3, 3);
        binaryTree.setData(bt4, 4);

        binaryTree.makeLeftSubTree(bt1, bt2);
        binaryTree.makeRightSubTree(bt1, bt3);
        binaryTree.makeLeftSubTree(bt2, bt4);

        System.out.println(binaryTree.getData(binaryTree.getLeftSubTree(bt1)));
        System.out.println(binaryTree.getData(binaryTree.getLeftSubTree(binaryTree.getLeftSubTree(bt1))));

    }

}
