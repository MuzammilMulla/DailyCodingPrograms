////Input : 12345
//Output : 15

public class SumOfDigitUsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfDigitUsingRecursion(12345,0));
    }

    static int sumOfDigitUsingRecursion(int n, int ans){
    if(n==0){
        return ans;
    }
    return sumOfDigitUsingRecursion(n/10, ans+(n%10));

    }




}
