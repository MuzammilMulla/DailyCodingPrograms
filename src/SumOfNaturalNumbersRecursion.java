public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        int n = 5;
        int ans =sumOfNaturalNumbersRecursion(n,0,0);
        System.out.println(ans);
    }
    static int sumOfNaturalNumbersRecursion(int n , int sum, int i){
        if(n<0){
            System.out.println(n%10);
        }
        if(i== n+1){
            return sum;
        }
        return sumOfNaturalNumbersRecursion(n, sum +i, i+1);
    }
}
