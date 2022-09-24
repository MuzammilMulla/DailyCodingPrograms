package QuestionsSolving;

public class SumTillN {
    public static void main(String[] args) {
        System.out.println(sum(10, 0));
    }

    static int sum(int n, int sum){
        //base case
        if(n==0){
            return sum;
        }

        // recursive call 
        return sum(n-1, sum+n);
    }
}
