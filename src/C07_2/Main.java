package C07_2;

import C07_2.DataStructure.CircularQueue;
import C07_2.DataStructure.CircularQueueImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueueImpl();
        queue.init();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty())
            System.out.println(queue.dequeue());

    }

}
