import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 43, 645, 1233};
   //     System.out.println(findIndex(arr, 1233, 0));
        ArrayList <Integer> ans = findAllIndex(arr,43,0,new ArrayList<>());
        System.out.println(ans);
       // System.out.println(findAllIndex(arr,43,0,new ArrayList<>()));
    }

    static int findIndex(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}