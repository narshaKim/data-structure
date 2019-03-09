package C07_3;

import C07_3.DataStructure.ListBaseQueue;
import C07_3.DataStructure.ListBaseQueueImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        ListBaseQueue queue = new ListBaseQueueImpl();
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
