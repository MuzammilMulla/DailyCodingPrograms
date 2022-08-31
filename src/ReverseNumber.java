public class ReverseNumber {
    public static void main(String[] args) {

  int n =1232;
  reverse(n);
        // System.out.println(ans);

//        int a=1824;
//        System.out.println(a%10);
    }


    static int reverse(int n) {
        if (n%10==0){
            return 0;
        }
        int a = n % 10;
        System.out.print(a);
        --n;

        return reverse(n-1);
    }
}
