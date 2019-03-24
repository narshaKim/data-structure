package C11_1;

import java.util.Arrays;

public class InterpolSearch {

    public static int recursiveBinarySearch(int k, int[] arr, int start, int end) {
        if(k<arr[start] || k>arr[end])
            return -1;
        int mid = (int)((double)(k-arr[start])/(arr[end]-arr[start]))*(end-start)+start;
        if(arr[mid]<k)
            return recursiveBinarySearch(k, arr, mid+1, end);
        else if(arr[mid]>k)
            return recursiveBinarySearch(k, arr, start, mid-1);
        else
            return mid;
    }

    public static void main(String[] args) {
        int test = 100;
        int range = 10;
        int arrayLength = 10;

        for(int t=0 ; t<test; t++) {
            int[] arr = new int[arrayLength];
            for(int i=0; i<arrayLength; i++) {
                arr[i]=(int) Math.floor(Math.random()*range);
            }
            Arrays.sort(arr);
            int idx = recursiveBinarySearch(2, arr, 1, arr.length-1);
            System.out.println(idx);
        }
    }

}
