import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr = { -41, -5, 45, 32, 7, 12312,-89, 0 };
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr , int r, int c){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }else{
            bubble(arr,r-1, 0);
        }
    }
}