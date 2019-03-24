package C11_1;

import C11_1.DataStructure.BinarySearchTree;
import C11_1.DataStructure.BinarySearchTreeImpl;
import C11_1.DataStructure.BinaryTreeNode;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTreeImpl();
        BinaryTreeNode root = bst.makeAndInit();
        bst.insert(root, 9);
        bst.insert(root, 1);
        bst.insert(root, 6);
        bst.insert(root, 2);
        bst.insert(root, 8);
        bst.insert(root, 3);
        bst.insert(root, 5);

        BinaryTreeNode search = bst.search(root, 1);
        if(search==null)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 성공 : " + bst.getNodeData(search));

        search = bst.search(root, 4);
        if(search==null)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 성공 : " + bst.getNodeData(search));

        search = bst.search(root, 6);
        if(search==null)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 성공 : " + bst.getNodeData(search));

        search = bst.search(root, 7);
        if(search==null)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 성공 : " + bst.getNodeData(search));

    }
}
