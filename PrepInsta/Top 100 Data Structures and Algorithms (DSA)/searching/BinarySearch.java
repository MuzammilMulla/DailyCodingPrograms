package DSA.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 34, 213, 657, 890};
        int item = 546;

        System.out.println(binarySearch(arr, item, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int item, int start, int end) {

        if(end>=start){
        int mid = start + (end - start) / 2;

        if (arr[mid] == item) return mid;
        if (arr[mid] < item)   return binarySearch(arr, item, mid + 1, end);
        if (arr[mid] > item)  return binarySearch(arr, item, start, mid - 1);
        }
        return -1;
    }
}
