public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = { -12, -3 , 0, 2, 5,75, 324, 3455, 12312};
        int target =324;
        int ans =binarySearch(arr, target);
        System.out.println(" target " + target +" index is : "+ ans);
    }

    static int binarySearch(int [] arr , int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end- start)/2;  //mid formula

            if(target <arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else{
               return mid;  // if mid is target
            }
        }
        return -1;    // if target not present or not found
    }
}
