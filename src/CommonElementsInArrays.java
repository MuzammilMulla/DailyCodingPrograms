package QuestionsSolving;

import java.util.HashSet;
import java.util.Set;
//input  :  int [] a ={1, 5, 10, 2, 10}; int [] b = {5, 10, 54, 2};
//output :  3  --> only three elements [5,10,2] are common in both arrays a & b.
public class CommonElementsInArrays {
    public static void main(String[] args) {
        int [] a ={1, 5, 10, 2, 10};
        int [] b = {5, 10, 54, 2};
        System.out.println(countElements(a,b));
    }

    static int countElements(int[] a, int [] b){
        Set<Integer> set = new HashSet<>();
        int count =0;
        for(int e : a){
            set.add(e);
        }
        for(int e : b){
            if(set.contains(e)){
                count++;
                set.remove(e);
            }
        }
        return count;
    }
}
