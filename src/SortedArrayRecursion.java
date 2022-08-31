
public class SortedArrayRecursion {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int size =5;
        //isSorted(arr,5);
        //System.out.println(sorted(arr,0));
        System.out.println(sum(arr, 0, 0));
    }

    static boolean sorted(int [] arr, int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        // RC
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }

    static int sum(int [] arr, int index, int sum){
        if(index == arr.length){
            return sum;
        }
        sum = sum + arr[index] ;
        return sum(arr, index+1, sum);
    }


}
