package C10_2;

import C07_3.DataStructure.ListBaseQueue;
import C07_3.DataStructure.ListBaseQueueImpl;

public class RadixSort {

    public static void main(String[] args) throws Exception {
        int n = 1000;

        for(int test=1; test<=10; test++) {
            System.out.println(test + "번째 테스트");
            int[] arr = new int[10];
            System.out.print("Before    Sort : ");
            for(int i=0; i<10; i++) {
                int newInt = (int)Math.floor(Math.random()*n);
                arr[i]=newInt;
                System.out.print(newInt + " ");
            }
            System.out.println();

            System.out.print("Radix    Sort : ");
            radixSort(arr, 4);
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println("------------------------------------------------");
        }

    }

    private static void radixSort(int[] arr, int maxLength) throws Exception {
        // bucket 초기화
        ListBaseQueue[] bucket = new ListBaseQueueImpl[10];
        for(int i=0; i<bucket.length; i++) {
            bucket[i] = new ListBaseQueueImpl();
            bucket[i].init();
        }

        for(int pos = 0; pos<maxLength; pos++) {
            for(int i=0; i<arr.length; i++) {
                int num = (int)(arr[i]/Math.pow(10, pos))%10;
                bucket[num].enqueue(arr[i]);
            }
            int idx = 0;
            for(ListBaseQueue queue : bucket) {
                while (!queue.isEmpty())
                    arr[idx++]=queue.dequeue();
            }
        }

    }


}
