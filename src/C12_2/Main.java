package C12_2;

import C11_2.DataStructure.BinaryTreeNode;
import C12_2.DataStructure.BinarySearchTree;
import C12_2.DataStructure.BinarySearchTreeImpl;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTreeImpl();
        BinaryTreeNode root = bst.makeAndInit();
        root=bst.insert(root, 1);
        root=bst.insert(root, 2);
        root=bst.insert(root, 3);
        root=bst.insert(root, 4);
        root=bst.insert(root, 5);
        root=bst.insert(root, 6);
        root=bst.insert(root, 7);
        root=bst.insert(root, 8);
        root=bst.insert(root, 9);

        System.out.println("루트 노드 : " + ((BinarySearchTreeImpl) bst).getData(root));

        BinaryTreeNode clNode = ((BinarySearchTreeImpl) bst).getLeftSubTree(root);
        BinaryTreeNode crNode = ((BinarySearchTreeImpl) bst).getRightSubTree(root);
        System.out.println(String.format("왼쪽1 : %d, 오른쪽1 : %d", ((BinarySearchTreeImpl) bst).getData(clNode), ((BinarySearchTreeImpl) bst).getData(crNode)));

        clNode = ((BinarySearchTreeImpl) bst).getLeftSubTree(clNode);
        crNode = ((BinarySearchTreeImpl) bst).getRightSubTree(crNode);
        System.out.println(String.format("왼쪽2 : %d, 오른쪽2 : %d", ((BinarySearchTreeImpl) bst).getData(clNode), ((BinarySearchTreeImpl) bst).getData(crNode)));

        clNode = ((BinarySearchTreeImpl) bst).getLeftSubTree(clNode);
        crNode = ((BinarySearchTreeImpl) bst).getRightSubTree(crNode);
        System.out.println(String.format("왼쪽3 : %d, 오른쪽3 : %d", ((BinarySearchTreeImpl) bst).getData(clNode), ((BinarySearchTreeImpl) bst).getData(crNode)));

        clNode = ((BinarySearchTreeImpl) bst).getLeftSubTree(clNode);
        crNode = ((BinarySearchTreeImpl) bst).getRightSubTree(crNode);
        System.out.println(String.format("왼쪽4 : %d, 오른쪽4 : %d", ((BinarySearchTreeImpl) bst).getData(clNode), ((BinarySearchTreeImpl) bst).getData(crNode)));


    }
}
