public class LinearSearchRecursion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int index =0;
        int target = 10 ;
        System.out.println(isLinearSearch(arr, index, target));
    }
    static int isLinearSearch(int [] arr, int index , int target){

        //base condition
        if(arr.length <1 || index== arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
           return isLinearSearch(arr, index+1, target);
        }

    }
}
