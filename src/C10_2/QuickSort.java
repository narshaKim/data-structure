package C10_2;

public class QuickSort {

    public static void main(String[] args) {
        int n = 10;

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

            System.out.print("Quick    Sort : ");
            quickSort(arr, 0, arr.length-1);
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println("------------------------------------------------");
        }

    }

    private static void quickSort(int[] arr, int left, int right) {
        if(!(left<right))
            return;
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotData = arr[left];
        int low = left+1;
        int high = right;
        while (low<=high) {
            while (low<=right && arr[low]<=pivotData) {
                low++;
            }
            while (high>=left+1 && arr[high]>=pivotData) {
                high--;
            }
            if (low<high) {
                arr[low]^=arr[high];
                arr[high]^=arr[low];
                arr[low]^=arr[high];
            }
        }
        if(left!=high) {
            arr[high]^=arr[left];
            arr[left]^=arr[high];
            arr[high]^=arr[left];
        }
        return high;
    }

}
