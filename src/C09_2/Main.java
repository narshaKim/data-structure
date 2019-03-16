package C09_2;

import C09_2.DataStructure.Heap;
import C09_2.DataStructure.HeapImpl;

public class Main {

    public static void main(String[] args) {
        Heap heap = new HeapImpl();
        heap.init();

        heap.insert('A', 1);
        heap.insert('B', 2);
        heap.insert('C', 3);
        System.out.println(heap.delete().data);

        heap.insert('A', 1);
        heap.insert('B', 2);
        heap.insert('C', 3);
        System.out.println(heap.delete().data);

        while (!heap.isEmpty()) {
            System.out.println(heap.delete().data);
        }
    }

}
