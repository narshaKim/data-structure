package C10_2;


import C10_2.DataStructure.Heap;
import C10_2.DataStructure.HeapImpl;

public class HeapSort {

    public static void main(String[] args) {
        int n = 30;

        Heap heap = new HeapImpl();
        heap.init();

        for(int test=1; test<5; test++) {
            System.out.println(test+"번째 테스트");

            System.out.print("Before Sort : ");
            for(int i=0; i<n; i++) {
                int newInt = (int)Math.floor(Math.random()*n);
                System.out.print(newInt + " ");
                heap.insert(newInt);
            }
            System.out.println();

            System.out.print("Heap   Sort : ");
            while (!heap.isEmpty())
                System.out.print(heap.delete() + " ");
            System.out.println();
            System.out.println("----------------------------------------------");
        }


    }
}
