import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int [] arr = { 1,2,4,0,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
      while(true){
            if ( i!= arr[i]){
                System.out.println(i);
            }
        }
        //System.out.println(Arrays.toString(new int[]{searchMissing(arr)}));


    }
    static  void cyclicSort(int [] arr){

        int i =0;
        while (i< arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

//    static int searchMissing(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if ( i!= arr[i]){
//                return  i;
//            }
//        }
//        return -1;
//    }
}
