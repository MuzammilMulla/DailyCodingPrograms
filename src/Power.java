public class Power {
    public static void main(String[] args) {
        int n =5;
        System.out.println(power(n));
    }

    static int power(int n){
        if(n==0){
            return 1;
        }
        return 2 *power(n-1);
    }
}
