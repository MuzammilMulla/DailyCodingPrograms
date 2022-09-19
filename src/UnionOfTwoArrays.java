package QuestionsSolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// input :  int [] a= {100,2,3,4,5,2};  int [] b = {11,2,3,6};
// output : [2, 3, 100, 4, 5, 6, 11]

public class UnionOfTwoArrays {
    public static void main(String[] args) {
    int [] a= {100,2,3,4,5,2};
    int [] b = {11,2,3,6};
    System.out.println(Arrays.toString(union(a,b)));
    }
    static Object[] union(int [] a, int[] b){
        Set<Integer> set = new HashSet<>();

        for(int elements : a){
            set.add(elements);
        }
        for(int elements : b){
            set.add(elements);
        }
        return set.toArray();
    }
}
