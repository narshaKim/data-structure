package C10_2;

public class MergeSort {

    public static void merge(int[] arr, int start, int end) {
        if(start>=end)
            return;

        int mid = (end+start)/2;
        merge(arr, start, mid);
        merge(arr, mid+1, end);

        mergeTwoArr(arr, start, mid, end);
    }

    private static void mergeTwoArr(int[] arr, int start, int mid, int end) {
        int[] sortArr = arr.clone();
        int lIdx = start;
        int rIdx = mid+1;
        int curIdx = start;

        while (lIdx<=mid && rIdx<=end) {
            if(arr[lIdx]<arr[rIdx])
                sortArr[curIdx++] = arr[lIdx++];
            else
                sortArr[curIdx++] = arr[rIdx++];
        }

        while (lIdx<=mid) {
            sortArr[curIdx++] = arr[lIdx++];
        }
        while (rIdx<=end) {
            sortArr[curIdx++] = arr[rIdx++];
        }

        for(int i=start; i<=end; i++)
            arr[i]=sortArr[i];
    }

    public static void main(String[] args) {
        int n = 20;

        for(int test=1; test<=5; test++) {
            System.out.println(test + "번째 테스트");
            int[] arr = new int[n];
            System.out.print("Before    Sort : ");
            for(int i=0; i<n; i++) {
                int newInt = (int)Math.floor(Math.random()*n);
                arr[i]=newInt;
                System.out.print(newInt + " ");
            }
            System.out.println();

            System.out.print("Merge    Sort : ");
            merge(arr, 0, arr.length-1);
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println("------------------------------------------------");
        }

    }

}
