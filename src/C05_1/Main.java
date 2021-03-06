package C05_1;

import C05_1.DataStructure.CircularLinkedList;
import C05_1.DataStructure.CircularLinkedListImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        CircularLinkedList circularLinkedList = new CircularLinkedListImpl();
        circularLinkedList.init();

        System.out.println("데이터 insert");
        circularLinkedList.insert(3);
        circularLinkedList.insert(4);
        circularLinkedList.insert(5);
        circularLinkedList.insertFront(1);
        circularLinkedList.insertFront(2);

        System.out.println("데이터 3번 회전 출력");
        if(circularLinkedList.first()) {
            System.out.print(circularLinkedList.get() + " ");
            for(int i=0; i<circularLinkedList.count()*3-1; i++) {
                if(circularLinkedList.next()) {
                    System.out.print(circularLinkedList.get() + " ");
                }
            }
        }
        System.out.println();


        System.out.println("2의 배수 제거");
        int nodeNum = circularLinkedList.count();
        if(nodeNum!=0) {
            circularLinkedList.first();
            if(circularLinkedList.get()%2==0)
                circularLinkedList.remove();
            for(int i=0; i<nodeNum-1; i++) {
                circularLinkedList.next();
                if(circularLinkedList.get()%2==0)
                    circularLinkedList.remove();
            }
        }

        System.out.println("데이터 3번 회전 출력");
        if(circularLinkedList.first()) {
            System.out.print(circularLinkedList.get() + " ");
            for(int i=0; i<circularLinkedList.count()*3-1; i++) {
                if(circularLinkedList.next()) {
                    System.out.print(circularLinkedList.get() + " ");
                }
            }
        }
        System.out.println();

    }

}
