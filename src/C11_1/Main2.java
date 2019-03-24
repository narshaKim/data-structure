package C11_1;

import C11_1.DataStructure.BinarySearchTree;
import C11_1.DataStructure.BinarySearchTreeImpl;
import C11_1.DataStructure.BinaryTreeNode;

public class Main2 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTreeImpl();
        BinaryTreeNode root = bst.makeAndInit();
        bst.insert(root, 5);
        bst.insert(root, 8);
        bst.insert(root, 1);
        bst.insert(root, 6);
        bst.insert(root, 4);
        bst.insert(root, 9);
        bst.insert(root, 3);
        bst.insert(root, 2);
        bst.insert(root, 7);

        ((BinarySearchTreeImpl) bst).inorderTraverse(root);
        System.out.println();

        root = bst.remove(root, 3);
        ((BinarySearchTreeImpl) bst).inorderTraverse(root);
        System.out.println();

        root = bst.remove(root, 8);
        ((BinarySearchTreeImpl) bst).inorderTraverse(root);
        System.out.println();

        root = bst.remove(root, 1);
        ((BinarySearchTreeImpl) bst).inorderTraverse(root);
        System.out.println();

        root = bst.remove(root, 6);
        ((BinarySearchTreeImpl) bst).inorderTraverse(root);
        System.out.println();

    }
}
