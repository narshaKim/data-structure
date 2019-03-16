package C10_1;

public class BasicSort {

    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    arr[j]^=arr[j+1];
                    arr[j+1]^=arr[j];
                    arr[j]^=arr[j+1];
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIdx]>arr[j])
                    minIdx=j;
            }
            if(minIdx==i)
                continue;
            arr[minIdx]^=arr[i];
            arr[i]^=arr[minIdx];
            arr[minIdx]^=arr[i];
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int j;
            for(j=i-1; j>=0; j--) {
                if(arr[j]<=arr[i])
                    break;
            }
            int data = arr[i];
            for(int k=i-1; k>=j+1; k--) {
                arr[k+1]=arr[k];
            }
            arr[j+1]=data;
        }
    }

    public static void main(String[] args) {
        int n = 30;

        int[] source = new int[n];

        for(int test=1; test<5; test++) {
            System.out.println(test+"번째 테스트");

            System.out.print("Before    Sort : ");
            for(int i=0; i<n; i++) {
                int newInt = (int)Math.floor(Math.random()*n);
                source[i]=newInt;
                System.out.print(newInt + " ");
            }
            System.out.println();

            int[] copy1 = source.clone();
            int[] copy2 = source.clone();
            int[] copy3 = source.clone();

            System.out.print("Bubble    Sort : ");
            bubbleSort(copy1);
            for(int i=0; i<copy1.length; i++)
                System.out.print(copy1[i] + " ");
            System.out.println();

            System.out.print("Selection Sort : ");
            selectionSort(copy2);
            for(int i=0; i<copy2.length; i++)
                System.out.print(copy2[i] + " ");
            System.out.println();

            System.out.print("Insertion Sort : ");
            insertionSort(copy3);
            for(int i=0; i<copy3.length; i++)
                System.out.print(copy3[i] + " ");
            System.out.println();
            System.out.println("-----------------------");
        }


    }
}
