import java.util.Arrays;

public class MinMaxValueOfArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {10, 200,10001, 30, 4100, 50,10000};
        minmax(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void minmax(int[] arr, int r, int c){
        if(r==0){
            System.out.println("Min value : " + arr[0] );
            System.out.println("Max value : " + arr[arr.length-1] );
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                int temp= arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            minmax(arr, r,c+1);
        }else{
            minmax(arr, r-1,0);
        }
    }
}
