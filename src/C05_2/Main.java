package C05_2;

import C05_2.DataStructure.DoublyLinkedList;
import C05_2.DataStructure.DoublyLinkedListImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedListImpl();
        doublyLinkedList.init();

        System.out.println("데이터 저장");
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);
        doublyLinkedList.insert(6);
        doublyLinkedList.insert(7);
        doublyLinkedList.insert(8);

        System.out.println("데이터 조회");
        if(doublyLinkedList.first()) {
            System.out.print(doublyLinkedList.get() + " ");
            while (doublyLinkedList.next())
                System.out.print(doublyLinkedList.get() + " ");
            while (doublyLinkedList.previous())
                System.out.print(doublyLinkedList.get() + " ");
        }
        System.out.println();

    }

}
