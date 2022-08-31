public class CountSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(helper(n, 0));
    }

    static  int helper(int n, int c ){
        if(n==0){
            return c;
        }
        if(n%2 == 0){
            return helper(n/2, c+1);
        }
        else if(n%2 == 1){
            return helper(n-1, c+1);
        }

        return helper(n,c) ;
    }

}