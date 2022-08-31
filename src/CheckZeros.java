public class CheckZeros {
    public static void main(String[] args) {
        int n = 2003004;
        System.out.println(helper(n, 0));
    }



    static  int helper(int n, int ans ){


        if(n==0){
            return ans;
        }
        if(n%10 == 0){
        return helper(n/10, ans+1);
        }

        return helper(n/10, ans) ;
    }

}
