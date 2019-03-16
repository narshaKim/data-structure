package C09_2_Advanced;

import C09_2_Advanced.DataStructure.*;

public class QueueMain {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueueImpl();
        priorityQueue.init(PriorityType.DESC);

        priorityQueue.enqueue('A');
        priorityQueue.enqueue('B');
        priorityQueue.enqueue('C');
        System.out.println(priorityQueue.dequeue());

        priorityQueue.enqueue('A');
        priorityQueue.enqueue('B');
        priorityQueue.enqueue('C');
        System.out.println(priorityQueue.dequeue());

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.dequeue());
        }
    }

}
