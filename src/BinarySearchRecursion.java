public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        // int [] arr = {10};
       // int [] arr = {};
        System.out.println(BSRecursion(arr,-1,0, arr.length-1));
    }

    static int BSRecursion(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        // Base Condition
        if(start > end){   //element not found
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }


        if (target < arr[mid]) {
            return BSRecursion(arr, target, start, mid - 1);
        } else {
            return BSRecursion(arr, target,  mid + 1, end);
        }
    }
}
