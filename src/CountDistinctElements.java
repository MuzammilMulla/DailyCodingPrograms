package QuestionsSolving;

import java.util.HashSet;
import java.util.Set;
//input = [1,2,3,4,3,2,5,5];
//output = 5  , there are only 5 distinct elements in the array
public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,3,2,5,5};
        System.out.println(countDistinct(arr));
    }
    static int countDistinct(int [] arr){
        int count =0;
        Set<Integer> set = new HashSet<>();
        for (int elements: arr)
        {
            set.add(elements);
        }
        return set.size();
    }
}
