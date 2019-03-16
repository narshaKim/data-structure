package C09_2_Advanced;

import C09_2_Advanced.DataStructure.Heap;
import C09_2_Advanced.DataStructure.HeapImpl;
import C09_2_Advanced.DataStructure.PriorityType;

public class HeapMain {

    public static void main(String[] args) {
        Heap heap = new HeapImpl();
        heap.init(PriorityType.DESC);

        heap.insert('A');
        heap.insert('B');
        heap.insert('C');
        System.out.println(heap.delete());

        heap.insert('A');
        heap.insert('B');
        heap.insert('C');
        System.out.println(heap.delete());

        while (!heap.isEmpty()) {
            System.out.println(heap.delete());
        }
    }

}
