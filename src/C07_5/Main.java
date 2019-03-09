package C07_5;

import C07_5.DataStructure.Deque;
import C07_5.DataStructure.DequeImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        Deque deque = new DequeImpl();
        deque.init();

        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);

        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        while (!deque.isEmpty())
            System.out.print(deque.removeFirst() + " ");
        System.out.println();

        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);

        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        while (!deque.isEmpty())
            System.out.print(deque.removeLast() + " ");

    }

}
