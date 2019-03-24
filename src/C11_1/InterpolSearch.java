package C11_1;

import java.util.Arrays;

public class InterpolSearch {

    public static int recursiveBinarySearch(int k, int[] arr, int start, int end) {
        if(start>end)
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
        int range = 10;
        int arrayLength = 10;
        int[] arr = new int[arrayLength];
        for(int i=0; i<arrayLength; i++) {
            arr[i]=(int) Math.floor(Math.random()*range);
        }
        Arrays.sort(arr);
        int idx = recursiveBinarySearch(3, arr, 0, arrayLength-1);
        System.out.println(idx);
    }

}
