package QuestionsSolving.BitManipulation;

public class NonRepeatingElementInArray {
    public static void main(String[] args) {

        int [] arr ={ 1,2,3,4,5,2,1,4,5};  // --> output : 3
        int res=0;
        for (int i = 0; i <arr.length ; i++) {
            res= res^arr[i];
        }
       System.out.println(res);
    }
}
