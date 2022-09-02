public class CheckArraySortedRecursion {
    public static void main(String[] args) {
        int [] arr = { 1,2,34,56,67};
        System.out.println(checkArraySortedRecursion(arr,0));
    }

    static boolean checkArraySortedRecursion(int [] arr, int i){

        if(arr.length == 0 || arr.length ==1){
            return true;
        }
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return checkArraySortedRecursion(arr,i+1);
    }
}
