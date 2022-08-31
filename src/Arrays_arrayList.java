import java.util.Arrays;

public class Arrays_arrayList {
    public static void main(String[] args) {


       // int [] arr= {190,12,3,4,58,6,8,32,234};
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        //swap(arr, 0,5);
        //maxValueWithinRange(arr, 1, 5);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(maxValue(arr));
        //System.out.println(maxValueWithinRange(arr, 3, 8));

       // System.out.println(linearSearch(arr, 2));
        System.out.println(linearSearchRange(arr, 1, 5, 0));
    }
    // swap numbers using array
    static void swap(int [] arr,int index1,int  index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }
    // find max value using array
    static int maxValue(int[] arr ){
        int max= arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    // find max within giving range

    static int maxValueWithinRange(int[] arr, int start, int end) {
        int max= arr[start];
        for (int i = start; i <=end ; i++) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
        }

    // LINEAR SEARCH // find a number


     static int  linearSearch(int[] arr, int target ) {

         int i;
         for (i = 0; i < arr.length; i++) {
             if (arr[i] == target) {
                 target = arr[i];
                 System.out.println("target found at "+ i);
             }
         }
         return target;
     }
    // LINEAR SEARCH // find a number  within giving range
    static int  linearSearchRange(int[] arr,int start , int end , int target ) {

        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == target) {
                target = arr[i];
                System.out.println("target found at "+ i);
            }
        }
        return target;
    }

    }

