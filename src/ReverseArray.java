package QuestionsSolving;

import java.util.Arrays;
// input : [10, 20, 30, 40, 50, 60];
//output : [60, 50, 40, 30, 20, 10]
public class ReverseArray {
    public static void main(String[] args) {
       int arr[] = {10,20,30,40,50,60};
      //  int[]arr ={10};
        //int [] arr = {};
        System.out.println(Arrays.toString(reverseSortedArray(arr)));
    }

    static int[] reverseSortedArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i < j && j > i) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    return arr;

    }
}
