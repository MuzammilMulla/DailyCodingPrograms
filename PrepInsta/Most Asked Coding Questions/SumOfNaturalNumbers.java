public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5,0));
    }

    static int sumOfNumbers(int number,int sum){

        //base condition
        if(number==0) return sum;
        //RC
        return sumOfNumbers(number-1,sum+number);

    }
}
